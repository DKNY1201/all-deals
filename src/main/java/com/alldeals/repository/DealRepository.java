package com.alldeals.repository;

import com.alldeals.domain.Deal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface DealRepository extends CrudRepository<Deal, Long>{
    @Query(value = "SELECT * FROM deal d WHERE d.isFeature = true", nativeQuery = true)
    List<Deal> getFeatureDeals();

    @Query(value = "SELECT * FROM deal d WHERE d.isFrontPage = true", nativeQuery = true)
    List<Deal> getFrontpageDeals();

    @Query(value = "SELECT * FROM deal d WHERE d.deal_cat_id = :catId", nativeQuery = true)
    List<Deal> getDealsByCategory(@Param("catId") int catId);
}
