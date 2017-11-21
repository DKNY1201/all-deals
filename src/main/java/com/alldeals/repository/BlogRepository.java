package com.alldeals.repository;

import com.alldeals.domain.Blog;
import com.alldeals.domain.Deal;
import com.alldeals.domain.DealCategory;
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
    @Query(value = "SELECT * FROM blog b WHERE b.blog_cat_id = :blogCatId", nativeQuery = true)
    List<Blog> findBlogsByCategory(@Param("blogCatId") Integer blogCatId);
}
