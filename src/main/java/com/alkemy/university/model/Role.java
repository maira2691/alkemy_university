package com.alkemy.university.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Long idRole;

    private String role;

    @OneToMany(mappedBy = "user")
    private List<UserRole> users;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
