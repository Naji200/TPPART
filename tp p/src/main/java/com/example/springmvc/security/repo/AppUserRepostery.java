package com.example.springmvc.security.repo;

import com.example.springmvc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepostery extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
