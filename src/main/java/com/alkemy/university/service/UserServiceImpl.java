package com.alkemy.university.service;

import com.alkemy.university.model.Student;
import com.alkemy.university.model.User;
import com.alkemy.university.repository.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DAOUser userDAO;

    //Buscar estudiante por DNI
    @Override
    public Optional<User> findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
