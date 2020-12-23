package com.alkemy.university.repository;

import com.alkemy.university.model.Profile;
import org.springframework.data.repository.CrudRepository;

public interface DAOProfile extends CrudRepository<Profile, Long> {
}
