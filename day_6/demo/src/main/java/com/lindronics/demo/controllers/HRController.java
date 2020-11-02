package com.lindronics.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

    @GetMapping("/hsbc/hr/{name}/{address}")
    public String aboutUs(@PathVariable("name") String name, @PathVariable("address") String address) {
        return name + " lives in " + address;
    }

}
