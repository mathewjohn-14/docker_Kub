package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello from Java CI/CD Pipeline 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running ✅";
    }

    @GetMapping("/user/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + " 👋";
    }
}