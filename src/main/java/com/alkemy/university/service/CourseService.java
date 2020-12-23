package com.alkemy.university.service;

import com.alkemy.university.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    public List<Course> getAll();

    public Optional<Course> getCourse(Long idCourse);
}
