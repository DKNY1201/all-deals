package com.alldeals.repository;

import com.alldeals.domain.BlogCategory;
import com.alldeals.domain.DealCategory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/18/17.
 */
@Repository
public interface BlogCategoryRepository extends CrudRepository<BlogCategory, Integer>{
}
