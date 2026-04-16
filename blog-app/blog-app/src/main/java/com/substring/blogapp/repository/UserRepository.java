package com.substring.blogapp.repository;

import com.substring.blogapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//all CRUD functionality
public interface UserRepository extends JpaRepository<User, Long> {
}
