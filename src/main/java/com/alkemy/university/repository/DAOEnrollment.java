package com.alkemy.university.repository;

import com.alkemy.university.model.Enrollment;
import com.alkemy.university.model.EnrollmentPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOEnrollment extends CrudRepository<Enrollment, EnrollmentPK> {
}
