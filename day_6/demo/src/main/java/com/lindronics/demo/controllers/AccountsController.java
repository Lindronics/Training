package com.lindronics.demo.controllers;

import com.lindronics.demo.utilities.Accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    Accounts acc;

    @GetMapping("/tax_calculation/{name}/{salary}")
    public String aboutUs(@PathVariable("name") String name, @PathVariable("salary") int salary) {
        return message(name) + " " + acc.calculateTax(salary);
    }

    public String message(String name) {
        return name + " tax: ";
    }

}