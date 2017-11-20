package com.alldeals.service;


import com.alldeals.domain.BlogArticle;

import java.util.List;

public interface BlogArticleService {
	
	public List<BlogArticle> getAll();
	public BlogArticle save(BlogArticle blogArticle);
	public void delete(int id);
	public BlogArticle get(int id);

}
