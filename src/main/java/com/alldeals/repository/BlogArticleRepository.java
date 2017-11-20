package com.alldeals.repository;

import com.alldeals.domain.BlogArticle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogArticleRepository extends CrudRepository<BlogArticle,Integer>{

}
