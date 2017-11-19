package com.alldeals.service;

import com.alldeals.domain.Deal;
import com.alldeals.domain.Store;
import com.alldeals.domain.User;
import com.alldeals.repository.DealRepository;
import com.alldeals.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @Autowired
    UserService userService;

    @Override
    public void save(Deal deal) {
        Date today = new Date();
        deal.setPostDate(today);

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();
        User user = userService.findUserByEmail(email);

        if (user != null) {
            user.addDeal(deal);
            userService.save(user);
        }

//        dealRepository.save(deal);
    }

    @Override
    public List<Deal> getFeatureDeals() {
        return (List<Deal>) dealRepository.getFeatureDeals();
    }

    @Override
    public List<Deal> getFrontpageDeals() {
        return dealRepository.getFrontpageDeals();
    }

    @Override
    public Deal findOne(Long dealId) {
        return dealRepository.findOne(dealId);
    }

    @Override
    public List<Deal> findAll() {
        return (List<Deal>) dealRepository.findAll();
    }

    @Override
    public List<Deal> findDealsByCategory(int dealCatId) {
        return dealRepository.findDealsByCategory(dealCatId);
    }

    @Override
    public List<Deal> findDealsByStore(int storeId) {
        return dealRepository.findDealsByStore(storeId);
    }
}
