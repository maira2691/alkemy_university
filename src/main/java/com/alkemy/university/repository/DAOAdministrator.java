package com.alkemy.university.repository;

import com.alkemy.university.model.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOAdministrator extends CrudRepository<Administrator, Long> {
}
