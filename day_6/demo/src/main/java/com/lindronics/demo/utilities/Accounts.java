package com.lindronics.demo.utilities;

import org.springframework.stereotype.Service;

@Service
public class Accounts {

    public double calculateTax(double grossSalary) {
        if (grossSalary >= 2000)
            return grossSalary * 0.25;
        else if (grossSalary >= 1000)
            return grossSalary * 0.15;
        else
            return 0;
    }

}
