package com.alkemy.university.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_student")
    private Long idStudent;

    private Integer file;

    @Column(name = "id_profile")
    private Long idProfile;

    @OneToOne(mappedBy = "student")
    private Profile profile;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> courses;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Long idProfile) {
        this.idProfile = idProfile;
    }
}
