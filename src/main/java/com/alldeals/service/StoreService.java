package com.alldeals.service;

import com.alldeals.domain.Store;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
public interface StoreService {
    List<Store> findAll();

    Store findOne(Integer storeId);

    List<Store> getRelatedStores(Integer storeId);
}
