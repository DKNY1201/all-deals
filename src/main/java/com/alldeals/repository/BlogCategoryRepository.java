package com.alldeals.repository;

import com.alldeals.domain.BlogCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCategoryRepository extends CrudRepository<BlogCategory,Integer>{

}
