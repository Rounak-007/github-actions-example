package com.example.github_actions_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Github actions Demo!!";
    }

    @GetMapping("/test")
    public String test(){
        return "Testing this out!!";
    }
}
