package com.alldeals.controller;

import com.alldeals.domain.User;
import com.alldeals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Bi on 11/12/17.
 */

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(@ModelAttribute("user") User user) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createUser(@Valid User user, BindingResult bindingResult) {
        User existingUser = userService.findUserByEmail(user.getEmail());
        if (existingUser != null) {
            bindingResult.rejectValue("email", "Email.duplicate",
                    "There is already a user registered with the email provided");
            return "register";
        }

        if (bindingResult.hasErrors()) {
            return "register";
        }

        userService.save(user);
        return "redirect:/login";
    }
}
