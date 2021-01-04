package com.alkemy.university.service;

import com.alkemy.university.model.Student;
import com.alkemy.university.repository.DAOStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    DAOStudent studentDAO;

   /* //Buscar estudiante por DNI
    @Override
    public Student findByDNI(String dni) {
            return studentDAO.findByDNI(dni);
        }*/
}
