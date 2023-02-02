package com.example.onlinemarketplacerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/check")
    public String check(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
}
