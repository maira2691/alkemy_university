package com.alkemy.university.repository;

import com.alkemy.university.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOTeacher extends JpaRepository<Teacher, Long> {
}
