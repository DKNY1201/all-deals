package com.alldeals.controller;

import com.alldeals.service.DealService;
import com.alldeals.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Bi on 11/19/17.
 */
@Controller
public class StoreController {
    @Autowired
    DealService dealService;

    @Autowired
    StoreService storeService;

    @GetMapping("/stores/{storeId}")
    public String showStores(@PathVariable("storeId") Integer storeId, Model model) {
        model.addAttribute("store", storeService.findOne(storeId));
        model.addAttribute("stores", storeService.getRelatedStores(storeId));
        model.addAttribute("deals", dealService.findDealsByStore(storeId));
        return "store";
    }
}
