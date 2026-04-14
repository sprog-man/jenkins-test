package com.petcompany.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hellowordl {
    @RequestMapping
    public String hello() {
        return "Hello World  222228887!";
    }
}
