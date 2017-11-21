package com.alldeals.controller;

import com.alldeals.domain.*;
import com.alldeals.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

/**
 * Created by Bi on 11/17/17.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogCategoryService blogCategoryService;

    @Autowired
    BlogService blogService;

    @GetMapping("/post")
    public String postDealForm(@ModelAttribute("blog") Blog blog, Model model) {
        model.addAttribute("categories", blogCategoryService.findAll());
        return "blog-post";
    }

    @PostMapping("/post")
    public String postBlog(@Valid Blog blog, BindingResult bindingResult, HttpServletRequest request, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", blogCategoryService.findAll());
            return "blog-post";
        }

        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        MultipartFile blogImage = blog.getImage();
        if (blogImage != null && !blogImage.isEmpty()) {
            try {
                blogImage.transferTo(new File(rootDirectory + "/resources/images/blogs/" + blog.getTitle() + ".jpg"));
            } catch (Exception e) {
                throw new RuntimeException("Blog image saving failed", e);
            }
        }

        BlogCategory blogCategory = blogCategoryService.findOne(blog.getBlogCategory().getId());
        blog.setBlogCategory(blogCategory);

        blogService.save(blog);

        return "redirect:/home";
    }

    @GetMapping("/detail/{id}")
    public String dealDetail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("blog", blogService.findOne(id));
        return "blog-detail";
    }

    @GetMapping(value = {"/categories/{categoryId}"})
    public String listBlog(@PathVariable("categoryId") Integer categoryId, Model model) {
        if (categoryId == 0) {
            model.addAttribute("blogs", blogService.findAll());
        } else {
            model.addAttribute("blogs", blogService.findBlogsByCategory(categoryId));
        }

        model.addAttribute("categories", blogCategoryService.findAll());
        return "blog-list";
    }
}
