package com.alldeals.service;

import com.alldeals.domain.DealCategory;
import com.alldeals.repository.DealCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Service
public class DealCategoryServiceImpl implements DealCategoryService {
    @Autowired
    DealCategoryRepository dealCategoryRepository;

    @Override
    public List<DealCategory> findAll() {
        return (List<DealCategory>) dealCategoryRepository.findAll();
    }

    @Override
    public DealCategory findOne(Integer dealCatId) {
        return dealCategoryRepository.findOne(dealCatId);
    }
}
