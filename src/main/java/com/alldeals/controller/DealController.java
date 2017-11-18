package com.alldeals.controller;

import com.alldeals.domain.Deal;
import com.alldeals.domain.DealCategory;
import com.alldeals.domain.Store;
import com.alldeals.service.DealCategoryService;
import com.alldeals.service.DealService;
import com.alldeals.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

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
        return "post-deal";
    }

    @PostMapping("/post")
    public String postDeal(@Valid Deal deal, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return "post-deal";
        }

        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        MultipartFile dealImage = deal.getDealImage();
        if (dealImage != null && !dealImage.isEmpty()) {
            try {
                dealImage.transferTo(new File(rootDirectory + "/resources/images/deals/" + deal.getId() + ".jpg"));
            } catch (Exception e) {
                throw new RuntimeException("Deal image saving failed", e);
            }
        }

        Store store = storeService.findOne(deal.getStore().getId());
        deal.setStore(store);

        DealCategory dealCategory = dealCategoryService.findOne(deal.getDealCategory().getId());
        deal.setDealCategory(dealCategory);

        dealService.save(deal);

        return "redirect:/home";
    }
}
