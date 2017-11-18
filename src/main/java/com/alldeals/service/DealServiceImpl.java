package com.alldeals.service;

import com.alldeals.domain.Deal;
import com.alldeals.domain.Store;
import com.alldeals.repository.DealRepository;
import com.alldeals.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Service
public class DealServiceImpl implements DealService {
    @Autowired
    DealRepository dealRepository;

    @Override
    public void save(Deal deal) {
        Date today = new Date();
        deal.setPostDate(today);
        dealRepository.save(deal);
    }

    @Override
    public List<Deal> getFeatureDeals() {
        return (List<Deal>) dealRepository.getFeatureDeals();
    }

    @Override
    public List<Deal> getFrontpageDeals() {
        return dealRepository.getFrontpageDeals();
    }
}
