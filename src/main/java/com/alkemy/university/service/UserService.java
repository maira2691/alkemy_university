package com.alkemy.university.service;

import com.alkemy.university.model.User;

public interface UserService {

    User findByDni(String dni);
}
