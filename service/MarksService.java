package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Marks;
import com.example.StudentManagement.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    private MarksRepository marksRepository;

    public Marks addMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    public Marks getMarks(Long userId) {
        return marksRepository.findById(userId).orElse(null);
    }
    // New method to fetch all marks
    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }
}
