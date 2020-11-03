package com.lindronics.sql_demo.repos;

import java.util.List;

import com.lindronics.sql_demo.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    public List<Student> findByName(String name);
    public List<Student> findByRegno(int regno);
    public List<Student> findByMarks(int marks);
}
