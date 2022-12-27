package com.hipo_delivery_be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @RequestMapping(value = "/api/helloworld")
    public String hello() {
        return "Hello world";
    }
}
