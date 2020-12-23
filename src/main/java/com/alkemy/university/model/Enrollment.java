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

    public EnrollmentPK getId() {
        return id;
    }

    public void setId(EnrollmentPK id) {
        this.id = id;
    }
}
