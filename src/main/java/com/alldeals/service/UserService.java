package com.alldeals.service;

import com.alldeals.domain.User;

/**
 * Created by Bi on 11/17/17.
 */
public interface UserService {
    void save(User user);

    User findUserByEmail(String email);

    void updateUser(User user);

    User findOne(Long userId);
}
