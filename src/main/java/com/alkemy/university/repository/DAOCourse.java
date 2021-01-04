package com.alkemy.university.repository;

import com.alkemy.university.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOCourse extends JpaRepository<Course, Long> {
}
