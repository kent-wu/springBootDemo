package com.kentwu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public ResponseEntity sayHello() {
        return ResponseEntity.ok("Hello World!");
    }
}
