package com.alkemy.university.controller;

import com.alkemy.university.model.Course;
import com.alkemy.university.service.CourseService;
import com.alkemy.university.service.EnrollmentService;
import com.alkemy.university.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @Autowired
    EnrollmentService enrollmentService;

    //Servicio para ver las materias
    @GetMapping("/allCourses")
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
            @ApiResponse(code = 404, message = "Teacher not found")
    })
    public ResponseEntity<Course> getCourses(@ApiParam(value = "The id of the course", required = true, example = "7")
                                               @PathVariable("id") Integer idCourse) {
        return courseService.getCourse(idCourse)
                .map(course -> new ResponseEntity<>(course, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //Servicio para inscribirse en materia
    @PutMapping("/{id}")
    @ApiOperation("Enrrollment one student")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Teacher not found")
    })
    public ResponseEntity<Course> enrollmentCourse(@PathVariable("id") Integer idCourse) {
        Course course = courseService.getOnlyCourse(idCourse);
        int spotsAvailable = course.getSpotsAvailable();
        int newSpots = spotsAvailable - 1;
        if(newSpots < 1)
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        course.setSpotsAvailable(newSpots);
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }


   /* @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(Authentication auth) throws Exception {
        ModelAndView model = new ModelAndView("loginStudent");
        model.addObject("student", studentService.findByDNI(auth.getName()));
        return model;
    }*/

  /*  @RequestMapping(method = RequestMethod.GET, value = "/listCourses/{dni}")
    public ModelAndView allCourses(@RequestParam ("dni") String dni, Model model) {
        Optional<Course> course = this.courseService.getCourse(id);
        ModelAndView mv = new ModelAndView("student");
        mv.addObject("course", course);
        mv.addObject("listCourses", courseService.getCourse(id));
        return mv;
    }*/
}
