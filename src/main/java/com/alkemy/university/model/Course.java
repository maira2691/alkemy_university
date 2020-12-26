package com.alkemy.university.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "id_teacher", insertable = false, updatable = false)
    private Teacher teacher;

   @ManyToOne
    @JoinColumn(name = "id_course", insertable = false, updatable = false)
    private Administrator administrator;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> students;

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
