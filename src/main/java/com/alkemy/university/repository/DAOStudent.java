package com.alkemy.university.repository;

import com.alkemy.university.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOStudent extends JpaRepository<Student, Long> {

    /*public Student findByDNI(String dni);*/
}
