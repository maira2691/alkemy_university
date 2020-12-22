package com.alkemy.university.model;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_course")
    private Long idCourse;

    private String name;
    private String description;

    @Column(name = "spots_available")
    private Integer spotsAvailable;

    @Column(name = "spots_max")
    private Integer spotsMax;

    private String schedule;

    @Column(name = "id_teacher")
    private Long idTeacher;

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSpotsAvailable() {
        return spotsAvailable;
    }

    public void setSpotsAvailable(Integer spotsAvailable) {
        this.spotsAvailable = spotsAvailable;
    }

    public Integer getSpotsMax() {
        return spotsMax;
    }

    public void setSpotsMax(Integer spotsMax) {
        this.spotsMax = spotsMax;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }
}
