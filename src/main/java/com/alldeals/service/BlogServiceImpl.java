package com.alldeals.service;

import com.alldeals.domain.Blog;
import com.alldeals.domain.User;
import com.alldeals.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Bi on 11/20/17.
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    UserService userService;

    @Override
    public void save(Blog blog) {
        Date today = new Date();
        blog.setPostDate(today);

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();
        User user = userService.findUserByEmail(email);

        if (user != null) {
            user.addBlog(blog);
        }

        blogRepository.save(blog);
    }

    @Override
    public Blog findOne(Long blogId) {
        return blogRepository.findOne(blogId);
    }

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public List<Blog> findBlogsByCategory(Integer catId) {
        return blogRepository.findBlogsByCategory(catId);
    }
}
