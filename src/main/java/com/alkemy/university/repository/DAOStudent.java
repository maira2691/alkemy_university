package com.alkemy.university.repository;

import com.alkemy.university.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOStudent extends CrudRepository<Student, Long> {
}
