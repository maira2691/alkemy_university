package com.alkemy.university.service;

import com.alkemy.university.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    List<Course> getAll();

    Optional<Course> getCourse(Integer idCourse);

    Course getOnlyCourse(Integer idCourse);

    Course save(Course course);

    void deleteById(Integer idCourse);
}
