package com.alkemy.university.controller;

import com.alkemy.university.model.Teacher;
import com.alkemy.university.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    //Servicio para ver todos los profesores
    @GetMapping("/all")
    @ApiOperation("Get all teachers")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Teacher>> getAll() {
        return new ResponseEntity<>(teacherService.getAll(), HttpStatus.OK);
    }

    //Servicio para ver los profesores por id
    @GetMapping("/{id}")
    @ApiOperation("Search a teacher with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Teacher not found")
    })
    public ResponseEntity<Teacher> getTeachers(@ApiParam(value = "The id of the teacher", required = true, example = "7")
                                             @PathVariable("id") Integer idTeacher) {
        return teacherService.getTeacher(idTeacher)
                .map(teacher -> new ResponseEntity<>(teacher, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //Servicio para crear un nuevo teacher
    @PostMapping("/save")
    @ApiOperation("Save a new teacher")
    @ApiResponse(code = 201, message = "Teacher created")
    public ResponseEntity<Teacher> save(@RequestBody Teacher teacher) {
        return new ResponseEntity<>(teacherService.save(teacher), HttpStatus.CREATED);
    }

    //Servicio para eliminar un profesor
    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete a teacher by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Teacher not found")
    })
    public ResponseEntity<HttpStatus> deleteTeacher(@ApiParam(value = "The id of the teacher", required = true)
                                                   @PathVariable("id") Integer idTeacher) {
        try {
            teacherService.deleteById(idTeacher);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Servicio para modificar un profesor
    @PutMapping("/update/{id}")
    @ApiOperation("Update a teacher by ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Teacher not found")})
    public ResponseEntity<Teacher> updateTeacher(@ApiParam(value = "The id of the teacher", required = true)
                                               @PathVariable("id") Integer idTeacher, @RequestBody Teacher teacherDetails) {

        Teacher teacher = teacherService.getTeacher(idTeacher)
                .orElseThrow(() -> new RuntimeException("Teacher - NOT FOUND"));

        teacher.setName(teacherDetails.getName());
        teacher.setLastName(teacherDetails.getLastName());
        teacher.setDni(teacherDetails.getDni());
        teacher.setActive(teacherDetails.getActive());

        Teacher updatedTeacher = teacherService.save(teacher);
        return new ResponseEntity<>(teacherService.save(teacher), HttpStatus.OK);
    }
}
