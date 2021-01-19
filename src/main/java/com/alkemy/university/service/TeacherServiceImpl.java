package com.alkemy.university.service;

import com.alkemy.university.model.Course;
import com.alkemy.university.model.Teacher;
import com.alkemy.university.repository.DAOTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private DAOTeacher teacherDAO;

    @Override
    public List<Teacher> getAll() {
        return (List<Teacher>) teacherDAO.findAll();
    }

    @Override
    public Optional<Teacher> getTeacher(Integer idTeacher) {
        return teacherDAO.findById(idTeacher);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherDAO.save(teacher);
    }

    @Override
    public void deleteById(Integer idTeacher) {
        teacherDAO.deleteById(idTeacher);
    }
}
