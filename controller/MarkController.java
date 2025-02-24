package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Marks;
import com.example.StudentManagement.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marks")
public class MarkController {
    @Autowired
    private MarksService marksService;

    // API to insert marks
    @PostMapping("/insert")
    public Marks addMarks(@RequestBody Marks marks) {
        return marksService.addMarks(marks);
    }

    // API to fetch marks by userId
    @GetMapping("/{userId}")
    public Marks getMarks(@PathVariable Long userId) {
        return marksService.getMarks(userId);
    }
}
