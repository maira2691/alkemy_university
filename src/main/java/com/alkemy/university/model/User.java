package com.alkemy.university.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    private Student student;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_administrator")
    private Administrator administrator;

    @OneToMany(mappedBy = "role")
    private List<UserRole> roles;

    public User() {
    }

    public User(String name, String lastName, String dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public Long getIdProfile() {
        return idUser;
    }

    public void setIdProfile(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
