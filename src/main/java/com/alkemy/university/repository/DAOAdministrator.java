package com.alkemy.university.repository;

import com.alkemy.university.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOAdministrator extends JpaRepository<Administrator, Long> {
}
