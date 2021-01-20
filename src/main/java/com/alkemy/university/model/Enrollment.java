package com.alkemy.university.model;

import javax.persistence.*;

@Entity
public class Enrollment {

    @EmbeddedId
    private EnrollmentPK id;

    @ManyToOne
    @JoinColumn(name = "id_student", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_course", insertable = false, updatable = false)
    private Course course;

    public Enrollment(Course course) {
        this.course = course;
    }

    public EnrollmentPK getId() {
        return id;
    }

    public void setId(EnrollmentPK id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
