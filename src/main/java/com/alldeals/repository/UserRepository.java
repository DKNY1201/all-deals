package com.alldeals.repository;

import com.alldeals.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/17/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
