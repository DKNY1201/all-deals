package com.alldeals.controller;

import com.alldeals.domain.Deal;
import com.alldeals.domain.DealCategory;
import com.alldeals.domain.Store;
import com.alldeals.exception.DealNotFoundException;
import com.alldeals.service.*;
import com.alldeals.utils.UrlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

/**
 * Created by Bi on 11/17/17.
 */
@Controller
@RequestMapping("/deals")
public class DealController {
    @Autowired
    DealCategoryService dealCategoryService;

    @Autowired
    StoreService storeService;

    @Autowired
    DealService dealService;

    @GetMapping("/post")
    public String postDealForm(@ModelAttribute("deal") Deal deal, Model model) {
        model.addAttribute("categories", dealCategoryService.findAll());
        model.addAttribute("stores", storeService.findAll());
        model.addAttribute("user", deal.getUser());
        model.addAttribute("comments", deal.getComments());
        return "deal-post";
    }

    @PostMapping("/post")
    public String postDeal(@Valid Deal deal, BindingResult bindingResult, HttpServletRequest request, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", dealCategoryService.findAll());
            model.addAttribute("stores", storeService.findAll());
            return "deal-post";
        }

        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        MultipartFile dealImage = deal.getDealImage();
        if (dealImage != null && !dealImage.isEmpty()) {
            try {
                dealImage.transferTo(new File(rootDirectory + "/resources/images/deals/" + deal.getDealTitle() + ".jpg"));
            } catch (Exception e) {
                throw new RuntimeException("Deal image saving failed", e);
            }
        }

        Store store = storeService.findOne(deal.getStore().getId());
        deal.setStore(store);

        DealCategory dealCategory = dealCategoryService.findOne(deal.getDealCategory().getId());
        deal.setDealCategory(dealCategory);

        dealService.save(deal);

        return "redirect:/deals/categories/0";
    }

    @GetMapping("/detail/{id}")
    public String dealDetail(@PathVariable("id") Long id, Model model) {
        Deal deal = dealService.findOne(id);

        if (deal == null) {
            throw new DealNotFoundException(id);
        }
        model.addAttribute("deal", dealService.findOne(id));
        return "deal-detail";
    }

    @GetMapping(value = {"/categories/{categoryId}"})
    public String listDeal(@PathVariable("categoryId") Integer categoryId, Model model) {
        if (categoryId == 0) {
            model.addAttribute("deals", dealService.findAll());
        } else {
            model.addAttribute("deals", dealService.findDealsByCategory(categoryId));
        }

        model.addAttribute("categories", dealCategoryService.findAll());
        return "deal-list";
    }

    @ExceptionHandler(DealNotFoundException.class)
    public String handleError(HttpServletRequest req, DealNotFoundException exception, Model model) {
        model.addAttribute("invalidDealId", exception.getDealId());
        model.addAttribute("exception", exception);
        model.addAttribute("url", UrlUtils.getFullURL(req));
        return "deal-not-found";
    }
}
