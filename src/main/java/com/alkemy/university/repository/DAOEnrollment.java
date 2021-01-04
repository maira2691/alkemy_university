package com.alkemy.university.repository;

import com.alkemy.university.model.Enrollment;
import com.alkemy.university.model.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOEnrollment extends JpaRepository<Enrollment, EnrollmentPK> {
}
