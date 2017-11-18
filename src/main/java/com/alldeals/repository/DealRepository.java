package com.alldeals.repository;

import com.alldeals.domain.Deal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface DealRepository extends CrudRepository<Deal, Integer>{
    @Query(value = "SELECT * FROM deal d WHERE d.isFeature = true", nativeQuery = true)
    List<Deal> getFeatureDeals();

    @Query(value = "SELECT * FROM deal d WHERE d.isFrontPage = true", nativeQuery = true)
    List<Deal> getFrontpageDeals();
}
