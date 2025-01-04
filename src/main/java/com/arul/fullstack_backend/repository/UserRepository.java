package com.arul.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arul.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
