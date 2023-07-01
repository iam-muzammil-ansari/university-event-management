package com.geekster.universityeventmanagement.controller;

import com.geekster.universityeventmanagement.model.Student;
import com.geekster.universityeventmanagement.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@Validated
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("addStudents")
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("updateStudentDepartment/{studentId}")
    public Optional<Student> updateStudentDepartment(@PathVariable Long studentId, @RequestBody Map<String, String> requestBody) {
        return  studentService.updateStudentDepartment(studentId, requestBody);
    }

    @GetMapping("getAllStudents")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("getStudentById/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @DeleteMapping("deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        return studentService.deleteStudent(studentId);
    }
}
