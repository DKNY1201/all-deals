package com.alldeals.repository;

import com.alldeals.domain.DealCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface DealCategoryRepository extends CrudRepository<DealCategory, Integer>{
}
