package com.lindronics.demo.entities;

public class Student {

    public int id;
    int marks;
    String name;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
    }
}
