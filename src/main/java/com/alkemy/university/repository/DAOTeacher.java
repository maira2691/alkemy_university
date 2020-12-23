package com.alkemy.university.repository;

import com.alkemy.university.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOTeacher extends CrudRepository<Teacher, Long> {
}
