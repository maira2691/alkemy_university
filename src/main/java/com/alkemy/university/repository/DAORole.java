package com.alkemy.university.repository;

import com.alkemy.university.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DAORole extends JpaRepository<Role, Long> {

    List<Role> findByRole(String role);
}
