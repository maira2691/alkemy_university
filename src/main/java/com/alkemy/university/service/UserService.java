package com.alkemy.university.service;

import com.alkemy.university.model.User;

import java.util.Optional;

public interface UserService {

   Optional<User> findByUsername(String username);
}
