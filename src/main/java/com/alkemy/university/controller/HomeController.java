package com.alkemy.university.controller;

import com.alkemy.university.model.Course;
import com.alkemy.university.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return "<h1>welcome home</h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1>welcome User</h1>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1>welcome admin</h1>";
    }

}
