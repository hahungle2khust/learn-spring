package com.hungle.mbf.logindemo.repository;

import com.hungle.mbf.logindemo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("select u from Users u where u.username = ?1")
    Users findByUsername(String username);
}
