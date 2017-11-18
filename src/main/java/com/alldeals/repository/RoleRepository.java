package com.alldeals.repository;

import com.alldeals.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Bi on 11/17/17.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    @Query(value = "SELECT r FROM Role r WHERE r.role = :role")
    Role findRoleByRoleName(@Param("role") String role);
}
