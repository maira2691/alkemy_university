package com.alkemy.university.service;

import com.alkemy.university.model.Course;
import com.alkemy.university.model.Enrollment;
import com.alkemy.university.model.Student;
import com.alkemy.university.repository.DAOCourse;
import com.alkemy.university.repository.DAOEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

    @Autowired
    DAOEnrollment enrollmentDAO;

    @Autowired
    DAOCourse courseDAO;

    @Override
    public void add(Enrollment enrollment) {

        enrollmentDAO.save(enrollment);

        Student s1 = enrollment.getStudent();
        Course c1 = enrollment.getCourse();

        if (s1.getCourses().contains(new Enrollment(c1))) {
           Integer cupos = c1.getSpotsAvailable();
           Integer nuevos = cupos - 1;

           courseDAO.save(c1);
        }
    }

    /*//Añadir un contacto
    @Override
    public void add(Contacto contacto) {

        LOGGER.log(Level.INFO, "EN CAPA SERVICIOS (CONTACTO): AÑADIENDO UN PERFIL A LA LISTA DE CONTACTOS");
        contactoDAO.save(contacto);

        Perfil p1 = contacto.getLiker();
        Perfil p2 = contacto.getLiked();

        if (p2.getContactos().contains(new Contacto(p2,p1))) {
            matchService.add(new Match(p1,p2));
            LOGGER.log(Level.INFO, "MATCH GENERADO: "+ p1.getUsername() + " and " + p2.getUsername());
            matchService.add(new Match(p2,p1));
            LOGGER.log(Level.INFO, "MATCH GENERADO: "+ p2.getUsername() + " and " + p1.getUsername());
        }
    }*/
}
