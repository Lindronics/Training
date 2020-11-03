package com.lindronics.sql_demo.controllers;

import java.util.List;

import com.lindronics.sql_demo.entities.Student;
import com.lindronics.sql_demo.repos.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/saverecord/{regno}/{marks}/{name}")
    public String saveRecord(@PathVariable("regno") int regno, @PathVariable("marks") int marks,
            @PathVariable("name") String name) {
        var student = new Student(regno, marks, name);
        repo.save(student);
        return "records saved";
    }

    @GetMapping("/showrecord/{regno}")
    public String showRecord(@PathVariable("regno") int regno) {
        var student = repo.findById(regno);
        return student.map(x -> x.toString()).orElse("Does not exist!");
    }

    @PostMapping("/insert_record")
    public String insertRecord(@RequestBody Student student) {
        var optional = repo.findById(student.getRegno());
        if (optional.isPresent()) return "Already present!";
        repo.save(student);
        return "records saved";
    }

    @GetMapping("/showbyname/{name}")
    public List<Student> showByName(@PathVariable String name) {
        return repo.findByName(name);
    }
    
}
