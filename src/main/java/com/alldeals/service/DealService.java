package com.alldeals.service;

import com.alldeals.domain.Deal;
import com.alldeals.domain.Store;
import org.springframework.security.core.Authentication;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
public interface DealService {
    void save(Deal deal);

    List<Deal> getFeatureDeals();

    List<Deal> getFrontpageDeals();

    Deal findOne(Long dealId);
}
