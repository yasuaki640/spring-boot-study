package com.example.demo.controller;

import com.example.demo.model.Inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@ModelAttribute Inquiry inquiry) {
        return "index";
    }

    @PostMapping("/")
    public String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        return "confirm";
    }
}
