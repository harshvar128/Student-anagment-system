package com.example.StudentManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motherName;
    private String fatherName;
    private String email;
    private Long userId; // Foreign key to User table

    public StudentDetails() {}

    public StudentDetails(String motherName, String fatherName, String email, Long userId) {
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.email = email;
        this.userId = userId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
