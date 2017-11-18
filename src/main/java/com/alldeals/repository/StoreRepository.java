package com.alldeals.repository;

import com.alldeals.domain.DealCategory;
import com.alldeals.domain.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface StoreRepository extends CrudRepository<Store, Integer>{
}
