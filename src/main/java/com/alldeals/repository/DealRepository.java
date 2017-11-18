package com.alldeals.repository;

import com.alldeals.domain.Deal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface DealRepository extends CrudRepository<Deal, Integer>{
}
