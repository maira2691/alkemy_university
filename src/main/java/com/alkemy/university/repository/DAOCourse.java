package com.alkemy.university.repository;

import com.alkemy.university.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOCourse extends CrudRepository<Course, Integer> {
}
