package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/users")
    public Map<String, String> getUsers() {
        Map<String, String> users = new HashMap<>();
        users.put("1", "John Doe");
        users.put("2", "Jane Doe");
        return users;
    }
}
