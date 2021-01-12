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
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    //Servicio para ver todas las materias
    @GetMapping("/all")
    @ApiOperation("Get all courses")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Course>> getAll() {
        return new ResponseEntity<>(courseService.getAll(), HttpStatus.OK);
    }

    //Servicio para ver las materias por id
    @GetMapping("/{id}")
    @ApiOperation("Search a course with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Course not found")
    })
    public ResponseEntity<Course> getProduct(@ApiParam(value = "The id of the course", required = true, example = "7")
                                             @PathVariable("id") Long idCourse) {
        return courseService.getCourse(idCourse)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
