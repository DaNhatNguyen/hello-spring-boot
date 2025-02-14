package com.nhat.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellospringController {
    @GetMapping("/hello")
    String sayHello(){
        return "Học Spring Boot 3 cùng Nhất";
    }
}
