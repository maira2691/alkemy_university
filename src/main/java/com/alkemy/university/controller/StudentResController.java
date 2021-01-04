package com.alkemy.university.controller;

import com.alkemy.university.model.Course;
import com.alkemy.university.service.CourseService;
import com.alkemy.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentResController {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

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
