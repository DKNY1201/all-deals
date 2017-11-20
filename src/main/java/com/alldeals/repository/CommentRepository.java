package com.alldeals.repository;

/**
 * Created by thanhhuyle on 11/17/17.
 */

import com.alldeals.domain.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    @Query(value = "SELECT c from Comment c where c.deal_id = :dealId", nativeQuery = true)
    List<Comment> getCommentsByDealId(String dealId);
}
