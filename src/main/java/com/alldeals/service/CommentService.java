package com.alldeals.service;

import com.alldeals.domain.Comment;
import com.alldeals.domain.CommentDTO;

import java.util.List;

/**
 * Created by thanhhuyle on 11/17/17.
 */
public interface CommentService {
    CommentDTO save(CommentDTO comment, Long dealId);

    List<Comment> getCommentsByDealId(String dealId);
}
