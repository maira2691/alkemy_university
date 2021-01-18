package com.alkemy.university.repository;

import com.alkemy.university.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DAOUser extends CrudRepository<User, Long> {

    public Optional<User> findByUsername(String username);
}
