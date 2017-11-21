package com.alldeals.service;

import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.DealCategory;
import com.alldeals.repository.BlogCategoryRepository;
import com.alldeals.repository.DealRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BlogServiceTest {
	private BlogCategory blogCategory;

	@Mock
	private BlogCategoryRepository blogCategoryRepository;

	@InjectMocks
	private BlogCategoryServiceImpl blogCategoryServiceImpl;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		blogCategory = new BlogCategory(1, "Mock category");
	}

	@Test
	public void getById() {
		String blogDesc = blogCategoryRepository.findOne(blogCategory.getId())!=null?
							blogCategoryRepository.findOne(blogCategory.getId()).getDescription(): "Not found";
		// Assert
		Assert.assertTrue(blogDesc.equals("Not found"));
	}

	@Test
	public void saveBlogCategory(){
		BlogCategory category = new BlogCategory(3, "New Mock Category");
		blogCategoryRepository.save(category);
	}
}