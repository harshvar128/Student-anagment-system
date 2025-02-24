package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.StudentDetails;
import com.example.StudentManagement.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    // API to insert student details
    @PostMapping("/details")
    public  StudentDetails addStudentDetails(@RequestBody StudentDetails studentDetails) {
        return studentDetailsService.addStudentDetails(studentDetails);

    }

    // API to fetch student details by userId+-
    @GetMapping("/details/{userId}")
    public StudentDetails getStudentDetails(@PathVariable Long userId) {
        return studentDetailsService.getStudentDetails(userId);
    }
}
