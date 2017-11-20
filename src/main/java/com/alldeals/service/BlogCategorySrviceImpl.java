package com.alldeals.service;

import java.util.List;

import com.alldeals.domain.BlogCategory;
import com.alldeals.repository.BlogCategoryRepository;
import org.apache.tiles.request.attribute.HasRemovableKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;



@Service
public class BlogCategorySrviceImpl implements BlogCategoryService{

	@Autowired
	private BlogCategoryRepository blogCategoryRepository;

	@Override
	public List<BlogCategory> getAll() {
		
		return (List<BlogCategory>) blogCategoryRepository.findAll();
	}

	@SuppressWarnings("unchecked")
	@PreAuthorize("hasRole('ADMIN')")
	@Override
	public BlogCategory save(BlogCategory blogCategory) {
		
		
		
		return blogCategoryRepository.save(blogCategory);
	}



	@Override
	public BlogCategory findOne(int blogCategoryId) {
		return blogCategoryRepository.findOne(blogCategoryId);
	}

//	@PreAuthorize("hasRole('Admin')")
//	@SuppressWarnings("unchecked")
//	@Override
//	public void delete(int id) {
//		blogCategoryRepository.delete(id);
//
//
//	}

}
