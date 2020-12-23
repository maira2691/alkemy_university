package com.alkemy.university.repository;

import com.alkemy.university.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface DAOStudent extends CrudRepository<Student, Long> {
}
