package com.alkemy.university.model;

import javax.persistence.*;

@Entity
public class Enrollment {

    @EmbeddedId
    private EnrollmentPK id;

    public EnrollmentPK getId() {
        return id;
    }

    public void setId(EnrollmentPK id) {
        this.id = id;
    }
}
