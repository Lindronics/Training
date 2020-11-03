package com.lindronics.sql_demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int regno;
    int marks;
    String name;

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int regno, int marks, String name) {
        this.regno = regno;
        this.marks = marks;
        this.name = name;
    }

    public Student() {
        
    }

    @Override
    public String toString() {
        return "{marks: " + marks + ", name: " + name + ", regno: " + regno + "}";
    }
}
