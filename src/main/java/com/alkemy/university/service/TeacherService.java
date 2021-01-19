package com.alkemy.university.service;

import com.alkemy.university.model.Course;
import com.alkemy.university.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    List<Teacher> getAll();

    Optional<Teacher> getTeacher(Integer idTeacher);

    Teacher save(Teacher teacher);

    void deleteById(Integer idTeacher);
}
