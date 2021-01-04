package com.alkemy.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

    @GetMapping("/home")
    public ModelAndView loginForm() {
        return new ModelAndView("login1");
    }

    //Esto es una prueba

}
