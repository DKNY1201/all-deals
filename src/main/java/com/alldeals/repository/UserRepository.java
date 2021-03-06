package com.alldeals.repository;

import com.alldeals.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/17/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT u FROM User u WHERE u.email = :email")
    User findUsersByEmail(@Param("email") String email);
}
