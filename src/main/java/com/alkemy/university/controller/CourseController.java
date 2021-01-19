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
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Course> getCourses(@ApiParam(value = "The id of the course", required = true, example = "7")
                                             @PathVariable("id") Integer idCourse) {
        return courseService.getCourse(idCourse)
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //Servicio para crear una nueva materia
    @PostMapping("/save")
    @ApiOperation("Save a new Course")
    @ApiResponse(code = 201, message = "Course created")
    public ResponseEntity<Course> save(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.save(course), HttpStatus.CREATED);
    }

    //Servicio para eliminar una materia
    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete a course by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Course not found")
    })
    public ResponseEntity<HttpStatus> deleteCourse(@ApiParam(value = "The id of the course", required = true)
                                 @PathVariable("id") Integer idCourse) {
        try {
            courseService.deleteById(idCourse);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Servicio para modificar una materia
    @PutMapping("/update/{id}")
    @ApiOperation("Update a course by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Course not found")})
    public ResponseEntity<Course> updateCourse(@ApiParam(value = "The id of the course", required = true)
                                   @PathVariable("id") Integer idCourse, @RequestBody Course courseDetails) {

        Course course = courseService.getCourse(idCourse)
                .orElseThrow(() -> new RuntimeException("Course - NOT FOUND"));

        course.setName(courseDetails.getName());
        course.setSchedule(courseDetails.getSchedule());
        course.setIdTeacher(courseDetails.getIdTeacher());
        course.setSpotsMax(courseDetails.getSpotsMax());

        Course updatedCourse = courseService.save(course);
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }
}
