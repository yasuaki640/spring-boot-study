package com.example.demo.controller;

import com.example.demo.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Scope("request")
@RequiredArgsConstructor
@Controller
public class ScopeController {
    private final CoffeeRepository repository;

    @GetMapping("/scope")
    public String showList(Model model) {
        model.addAttribute("toString", this.toString());
        model.addAttribute("allCoffee", repository.findAll());
        return "index";
    }
}
