package com.alkemy.university.service;

import com.alkemy.university.repository.DAOProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private DAOProfile profileDAO;

}
