package com.alkemy.university.service;

import com.alkemy.university.repository.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DAOUser profileDAO;

}
