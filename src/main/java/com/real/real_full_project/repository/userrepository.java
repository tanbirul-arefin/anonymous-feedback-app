package com.real.real_full_project.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface userrepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
