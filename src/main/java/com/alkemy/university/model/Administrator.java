package com.alkemy.university.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrator")
    private Long idAdministrator;

    @Column(name = "id_course")
    private Long idCourse;

    @Column(name = "id_teacher")
    private Long idTeacher;

    @Column(name = "id_user")
    private Long idUser;

    @OneToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    @OneToMany
    @JoinColumn(name = "id_teacher")
    private List<Teacher> teachers;

    @OneToMany
    @JoinColumn(name = "id_course", insertable = false, updatable = false)
    private List<Course> courses;

    public Long getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(Long idAdministrator) {
        this.idAdministrator = idAdministrator;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

}
