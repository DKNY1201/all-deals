package com.alldeals.controller;

import com.alldeals.domain.User;
import com.alldeals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

/**
 * Created by Bi on 11/12/17.
 */

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(@ModelAttribute("user") User user) {
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, HttpServletRequest request) {
        User existingUser = userService.findUserByEmail(user.getEmail());
        if (existingUser != null) {
            bindingResult.rejectValue("email", "Email.duplicate",
                    "There is already a user registered with the email provided");
            return "register";
        }

        if (bindingResult.hasErrors()) {
            return "register";
        }

        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        MultipartFile profilePicture = user.getProfilePicture();
        if (profilePicture != null && !profilePicture.isEmpty()) {
            try {
                profilePicture.transferTo(new File(rootDirectory + "/resources/images/users/" + user.getEmail() + ".jpg"));
            } catch (Exception e) {
                throw new RuntimeException("Profile picture saving failed", e);
            }
        }

        userService.save(user);
        return "redirect:/login";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setAllowedFields("email", "password", "firstName", "lastName", "address.street", "address.city",
                "address.state", "address.zip", "profilePicture");
    }
}
