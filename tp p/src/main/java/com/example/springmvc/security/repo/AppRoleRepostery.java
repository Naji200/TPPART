package com.example.springmvc.security.repo;

import com.example.springmvc.security.entities.AppRole;
import com.example.springmvc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepostery extends JpaRepository<AppRole,String> {
    AppRole findByRole(String role);
}
