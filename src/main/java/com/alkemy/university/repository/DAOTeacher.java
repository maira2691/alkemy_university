package com.alkemy.university.repository;

import com.alkemy.university.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface DAOTeacher extends CrudRepository<Teacher, Long> {
}
