package com.aurionpro.studentapp.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aurionpro.studentapp.entity.Student;
//import com.aurionpro.studentapp.entity.Student;
import com.aurionpro.studentapp.service.StudentService;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList = this.studentService.findAll();
        return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        Student student = this.studentService.findById(id);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student tempStudent = this.studentService.save(student);
        return new ResponseEntity<Student>(tempStudent, HttpStatus.CREATED);
    }

    @PutMapping("/students")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student tempStudent = this.studentService.save(student);
        return new ResponseEntity<Student>(tempStudent, HttpStatus.OK);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int id) {
        this.studentService.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
