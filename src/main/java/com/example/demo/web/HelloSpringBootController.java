package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @RequestMapping("/")
    public String hello() {

        return "Hello Spring Boot！";

    }

}
