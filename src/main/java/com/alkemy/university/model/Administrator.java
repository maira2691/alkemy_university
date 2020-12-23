package com.alkemy.university.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_administrator")
    private Long idAdministrator;

    @Column(name = "id_course")
    private Long idCourse;

    @Column(name = "id_teacher")
    private Long idTeacher;

    @Column(name = "id_profile")
    private Long idProfile;

    @OneToOne(mappedBy = "administrator")
    private Profile profile;

    @OneToMany(mappedBy = "administrator")
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "administrator")
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

    public Long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Long idProfile) {
        this.idProfile = idProfile;
    }
}
