package com.alldeals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bi on 11/12/17.
 */

@Controller
public class LoginController {

    @RequestMapping({"/login"})
    public String showLoginForm() {
        return "login";
    }
}
