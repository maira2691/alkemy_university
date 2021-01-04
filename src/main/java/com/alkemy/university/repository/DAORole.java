package com.alkemy.university.repository;

import com.alkemy.university.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DAORole extends CrudRepository<Role, Long> {

    List<Role> findByRole(String role);
}
