package com.example.appbanbanhv2.repository;

import com.example.appbanbanhv2.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, String> {
}