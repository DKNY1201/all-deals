package com.alldeals.service;

import com.alldeals.domain.Blog;
import com.alldeals.domain.Deal;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
public interface BlogService {
    void save(Blog blog);

    Blog findOne(Long blogId);

    List<Blog> findAll();

    List<Blog> findBlogsByCategory(Integer catId);
}
