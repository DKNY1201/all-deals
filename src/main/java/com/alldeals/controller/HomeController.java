package com.alldeals.controller;

import com.alldeals.service.CommentService;
import com.alldeals.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bi on 11/12/17.
 */

@Controller
public class HomeController {
    @Autowired
    DealService dealService;

    @Autowired
    CommentService commentService;

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("featureDeals", dealService.getFeatureDeals());
        model.addAttribute("frontpageDeals", dealService.getFrontpageDeals());

        return "home";
    }
}
