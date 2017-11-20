package com.alldeals.controller;

import com.alldeals.domain.Comment;
import com.alldeals.domain.CommentDTO;
import com.alldeals.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by thanhhuyle on 11/17/17.
 */

@RestController
@RequestMapping(value="rest/comment")
public class CommentRestController {

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/{dealId}")
    @ResponseStatus(value = HttpStatus.CREATED)
    public CommentDTO saveComment(@Valid @RequestBody CommentDTO comment, @PathVariable("dealId") Long dealId) {
        return commentService.save(comment, dealId);
    }
}
