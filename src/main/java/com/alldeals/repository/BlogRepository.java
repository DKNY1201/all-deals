package com.alldeals.repository;

import com.alldeals.domain.Blog;
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
public interface BlogRepository extends CrudRepository<Blog, Long>{
}
