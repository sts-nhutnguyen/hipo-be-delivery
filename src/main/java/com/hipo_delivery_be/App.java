package com.hipo_delivery_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/api/helloworld")
    ResponseEntity<?> hello() {
        Object resBody = new Object() {
            private String msg = "Hello world";

            public String getMsg() {
                return msg;
            }
        };
        return ResponseEntity.ok(resBody);
    }
}