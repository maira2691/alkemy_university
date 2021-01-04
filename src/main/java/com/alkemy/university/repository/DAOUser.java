package com.alkemy.university.repository;

import com.alkemy.university.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOUser extends CrudRepository<User, Long> {

    public User findByDni(String dni);
}
