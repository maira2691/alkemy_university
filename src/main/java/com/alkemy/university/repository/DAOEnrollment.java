package com.alkemy.university.repository;

import com.alkemy.university.model.Enrollment;
import com.alkemy.university.model.EnrollmentPK;
import org.springframework.data.repository.CrudRepository;

public interface DAOEnrollment extends CrudRepository<Enrollment, EnrollmentPK> {
}
