package com.alkemy.university.controller;

import com.alkemy.university.model.Course;
import com.alkemy.university.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    //Servicio para ver todas las materias
    @GetMapping("/materias")
    @ApiOperation("Get all courses")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Course>> getAll() {
        return new ResponseEntity<>(courseService.getAll(), HttpStatus.OK);
    }

}
