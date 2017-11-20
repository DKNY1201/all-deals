package com.alldeals.service;

import com.alldeals.domain.Comment;
import com.alldeals.domain.CommentDTO;
import com.alldeals.domain.Deal;
import com.alldeals.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by thanhhuyle on 11/17/17.
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    DealService dealService;

    @Override
    public CommentDTO save(CommentDTO commentDTO, Long dealId) {
        Deal deal = dealService.findOne(dealId);
        Comment comment = new Comment(commentDTO.getTitle(), commentDTO.getContent());
        Date today = new Date();
        comment.setPostingTime(today);
        if (deal != null) {
            deal.addComment(comment);
        }

        Comment savedComment = commentRepository.save(comment);
        CommentDTO returnCommentDTO = new CommentDTO(savedComment.getTitle(), savedComment.getContent());
        returnCommentDTO.setPostingTime(comment.getPostingTime());

        return returnCommentDTO;
    }

    @Override
    public List<Comment> getCommentsByDealId(String dealId) { return (List<Comment>) commentRepository.getCommentsByDealId(dealId); }
}
