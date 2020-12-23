package com.alkemy.university.repository;

import com.alkemy.university.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface DAOCourse extends CrudRepository<Course, Long> {
}
