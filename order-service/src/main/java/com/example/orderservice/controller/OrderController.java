package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Map<String, String> getOrders() {
        Map<String, String> orders = new HashMap<>();
        orders.put("1", "Order 1");
        orders.put("2", "Order 2");
        return orders;
    }
}
