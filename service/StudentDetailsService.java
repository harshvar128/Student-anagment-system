package com.example.StudentManagement.service;

import com.example.StudentManagement.model.StudentDetails;
import com.example.StudentManagement.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public StudentDetails addStudentDetails(StudentDetails studentDetails) {
        return studentDetailsRepository.save(studentDetails);
    }

    public StudentDetails getStudentDetails(Long userId) {
        return studentDetailsRepository.findById(userId).orElse(null);
    }

    // New method to fetch all student details
    public List<StudentDetails> getAllStudentDetails() {
        return studentDetailsRepository.findAll();
    }
}
