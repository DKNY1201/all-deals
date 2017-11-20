package com.alldeals.service;


import com.alldeals.domain.BlogArticle;
import com.alldeals.repository.BlogArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogArticleServiceImpl implements BlogArticleService{
	
	@Autowired
	private BlogArticleRepository blogArticleRepository;

	@Override
	public List<BlogArticle> getAll() {
		
		return (List<BlogArticle>) blogArticleRepository.findAll();
	}

	@Override
	public BlogArticle save(BlogArticle blogArticle) {
		
		
		return (BlogArticle) blogArticleRepository.save(blogArticle);
	}

	@Override
	public void delete(int id) {
		blogArticleRepository.delete(id);
		
		
	}

	@Override
	public BlogArticle get(int id) {
		
		return  blogArticleRepository.findOne(id);
	}

}
