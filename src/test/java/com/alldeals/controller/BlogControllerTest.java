package com.alldeals.controller;

import com.alldeals.config.WebApplicationContextConfig;
import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.Deal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplicationContextConfig.class)
@WebAppConfiguration
public class BlogControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void getBlogCategories() throws Exception {
		this.mockMvc.perform(get("/blog/categories/0")).andExpect(model().attributeExists("categories"));
	}

//	@Test
//	public void loadBlogPostForm() throws Exception {
//		List<BlogCategory> categories = new ArrayList<>();
//		categories.add(new BlogCategory(1, "Mock 1"));
//		categories.add(new BlogCategory(2, "Mock 2"));
//
//		// Act & Assert
//		this.mockMvc.perform(get("/blog/post")).andExpect(model().attributeExists("categories"));
//				//.andExpect(model().attribute("categories", categories));
//	}
}
