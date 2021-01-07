package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "hello";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam("message") String message, Model model) {
        model.addAttribute("sample", message);
        return "hello";
    }
}
