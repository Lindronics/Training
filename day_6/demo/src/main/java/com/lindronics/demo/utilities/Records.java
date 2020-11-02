package com.lindronics.demo.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {
    ArrayList<String> employees = new ArrayList<String>();

    public Records() {
        employees.add("niklas");
        employees.add("test");
    }

    public ArrayList<String> showEmployees() {
        return employees;
    }

    public void addRecord(String name) {
        employees.add(name);
    }
}
