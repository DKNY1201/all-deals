package com.alldeals.service;

import com.alldeals.domain.Store;
import com.alldeals.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    StoreRepository storeRepository;

    @Override
    public List<Store> findAll() {
        return (List<Store>) storeRepository.findAll();
    }

    @Override
    public Store findOne(Integer storeId) {
        return storeRepository.findOne(storeId);
    }
}
