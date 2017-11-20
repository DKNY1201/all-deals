package com.alldeals.service;

import com.alldeals.domain.BlogCategory;

import java.util.List;



public interface BlogCategoryService {
	
	public List<BlogCategory> getAll();
	public BlogCategory save(BlogCategory blogCategory);
	public BlogCategory findOne(int id);

}
