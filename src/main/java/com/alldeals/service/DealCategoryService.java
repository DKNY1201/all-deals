package com.alldeals.service;

import com.alldeals.domain.DealCategory;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
public interface DealCategoryService {
    List<DealCategory> findAll();

    DealCategory findOne(Integer dealCatId);

    DealCategory getDealCategoryByName(String dealCatName);
}
