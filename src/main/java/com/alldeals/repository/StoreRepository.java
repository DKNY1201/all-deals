package com.alldeals.repository;

import com.alldeals.domain.Deal;
import com.alldeals.domain.DealCategory;
import com.alldeals.domain.Store;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface StoreRepository extends CrudRepository<Store, Integer>{
    @Query(value = "SELECT * FROM store s WHERE s.store_id != :storeId", nativeQuery = true)
    List<Store> getRelatedStores(@Param("storeId") Integer storeId);
}
