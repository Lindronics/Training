package com.lindronics.demo.controllers;

import java.util.stream.Collectors;

import com.lindronics.demo.entities.Student;
import com.lindronics.demo.utilities.StudentRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRecord rec;

    @GetMapping("/students")
    public String showStudents() {
        return rec.showStudents().stream().map(student -> student.toString()).collect(Collectors.joining(","));
    }

    @GetMapping("/students/add/{regno}/{name}/{marks}")
    public String saverecord(@PathVariable("regno") int regno, @PathVariable("name") String name,
            @PathVariable("marks") int marks) {
        rec.addStudent(new Student(regno, marks, name));
        return "Saved";
    }

    @GetMapping("/students/{id}")
    public String getStudent(@PathVariable("id") int id) {
        return rec.getStudent(id).toString();
    }
}
