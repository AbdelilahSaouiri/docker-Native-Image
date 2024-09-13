package com.example.graalvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class HomeController {


    @GetMapping("/{name}")
    public String hello(@PathVariable(name="name") String name) {
        return "Hello " + name;
    }
}
