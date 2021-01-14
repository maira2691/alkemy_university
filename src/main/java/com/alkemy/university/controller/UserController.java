package com.alkemy.university.controller;

import com.alkemy.university.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/HOLA")
public class UserController {

    @Autowired
    UserService userService;

      /* @RequestMapping(value = "/loginStudent", method = RequestMethod.GET)
    public ModelAndView handleRequest(Authentication auth) throws Exception {
        ModelAndView model = new ModelAndView("loginStudent");
        model.addObject("student", userService.findByUsername(auth.getName()));
        return model;
    }*/
}
