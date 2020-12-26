package com.alkemy.university.controller;

import com.alkemy.university.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class UserRestController {

    @Autowired
    UserService userService;
}
