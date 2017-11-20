package com.alldeals.controller;



import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.alldeals.domain.BlogArticle;
import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.DealCategory;
import com.alldeals.service.BlogArticleService;
import com.alldeals.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class BlogArticleController {
	
	@Autowired
	private BlogArticleService blogArticleService;
	
	@Autowired
	private BlogCategoryService blogCategoryService;

    @RequestMapping(value= "/blogList", method = RequestMethod.GET)
    public String getBlogList( Model model) {
        List<BlogArticle> blogArticles = blogArticleService.getAll();
        model.addAttribute("blogArticleList", blogArticles);
        return "BlogList";
    }

	@RequestMapping(value= "/createBlog", method = RequestMethod.GET)
    public String getBlogForm(@ModelAttribute("newBlog") BlogArticle blogArticle, Model model) {
		List<BlogCategory> blogCategories = blogCategoryService.getAll();
		model.addAttribute("blogCategory", blogCategories);
		return "BlogForm";
	}
	
	@RequestMapping(value = "/creatBlog", method = RequestMethod.POST)
	public String saveBlogArticle(@Valid@ModelAttribute("newBlog") BlogArticle blogArticle, BindingResult result,
								  RedirectAttributes redirectAttributes, HttpServletRequest request, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("blogCategory", blogCategoryService.getAll());
			return "BlogForm";
		}
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		MultipartFile blogPhoto = blogArticle.getBlogPhoto();
		if (blogPhoto != null && !blogPhoto.isEmpty()) {
			try {
				blogPhoto.transferTo(new File(rootDirectory + "/resources/images/blog/" + blogArticle.getTitle() + ".jpg"));
			} catch (Exception e) {
				throw new RuntimeException("Blog image saving failed", e);
			}
		}
		int bcid = (int)blogArticle.getBlogCategory().getBlogCategoryId();
        BlogCategory blogCategory = blogCategoryService.findOne(bcid);
        blogArticle.setBlogCategory(blogCategory);
		blogArticleService.save(blogArticle);
		redirectAttributes.addFlashAttribute("blogArticle", blogArticle);
				return "redirect:blogDetails";		
	}
	@RequestMapping(value="/blogDetails", method=RequestMethod.GET)
		public String checkBlogDetails() {
		
		return "blogDetails";
		}
	
   }

