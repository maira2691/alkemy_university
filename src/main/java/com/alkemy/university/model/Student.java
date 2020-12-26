package com.alkemy.university.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Long idStudent;

    private Integer file;

    @Column(name = "id_user")
    private Long idUser;

    @OneToOne(mappedBy = "student")
    private User user;

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
}
