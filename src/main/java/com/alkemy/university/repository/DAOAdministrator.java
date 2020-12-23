package com.alkemy.university.repository;

import com.alkemy.university.model.Administrator;
import org.springframework.data.repository.CrudRepository;

public interface DAOAdministrator extends CrudRepository<Administrator, Long> {
}
