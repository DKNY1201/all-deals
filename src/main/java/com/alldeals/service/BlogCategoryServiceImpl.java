package com.alldeals.service;

import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.DealCategory;
import com.alldeals.repository.BlogCategoryRepository;
import com.alldeals.repository.BlogRepository;
import com.alldeals.repository.DealCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Service
public class BlogCategoryServiceImpl implements BlogCategoryService {
    @Autowired
    BlogCategoryRepository blogCategoryRepository;

    @Override
    public List<BlogCategory> findAll() {
        return (List<BlogCategory>) blogCategoryRepository.findAll();
    }

    @Override
    public BlogCategory findOne(Integer blogCatId) {
        return blogCategoryRepository.findOne(blogCatId);
    }
}
