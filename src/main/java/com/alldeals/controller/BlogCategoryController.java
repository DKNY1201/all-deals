package com.alldeals.controller;

import javax.validation.Valid;

import com.alldeals.domain.BlogCategory;
import com.alldeals.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class BlogCategoryController {
	
	@Autowired
	private BlogCategoryService blogCategoryService;
	
	@RequestMapping(value ="/addBlogCategory", method = RequestMethod.GET)
	public String getCategoryForm(@Valid@ModelAttribute("newBlogCategory") BlogCategory blogCategory) {
		
		return "BlogCategoryForm";
	}
	
	@RequestMapping(value="/addBlogCategory", method = RequestMethod.POST)
	public String createBlogCategory(@Valid@ModelAttribute("newBlogCategory") BlogCategory blogCategory, 
			BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors())
			return "BlogCategoryForm";
		blogCategoryService.save(blogCategory);
		redirectAttributes.addFlashAttribute("blogCategory", blogCategory);
		return "redirect:blogCategoryDetails";
		
	}
	@RequestMapping(value ="/blogCategoryDetails", method=RequestMethod.GET)
	public String getCategoryDetails() {
		return "BlogCategoryDetails";
	}

}
