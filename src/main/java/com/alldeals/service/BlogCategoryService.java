package com.alldeals.service;

import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.DealCategory;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
public interface BlogCategoryService {
    List<BlogCategory> findAll();

    BlogCategory findOne(Integer blogCatId);

}
