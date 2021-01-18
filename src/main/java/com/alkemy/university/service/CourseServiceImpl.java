package com.alkemy.university.service;

import com.alkemy.university.model.Course;
import com.alkemy.university.repository.DAOCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private DAOCourse courseDAO;

    @Override
    public List<Course> getAll() {
        return (List<Course>) courseDAO.findAll();
    }

    @Override
    public Optional<Course> getCourse(Integer idCourse) {
        return courseDAO.findById(idCourse);
    }

    @Override
    public Course save(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public void deleteById(Integer idCourse) {
        courseDAO.deleteById(idCourse);
    }

}
