package com.lindronics.demo.utilities;

import java.util.ArrayList;

import com.lindronics.demo.entities.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentRecord {
    ArrayList<Student> students = new ArrayList<Student>();

    public StudentRecord() {
        students.add(new Student(100, 200, "Niklas"));
    }

    public ArrayList<Student> showStudents() {
        return students;
    }

    public void addStudent(Student st) {
        students.add(st);
    }

    public Student getStudent(int i) {
        return students.stream().filter(student -> student.id == i).findAny().orElse(null);
    }
}
