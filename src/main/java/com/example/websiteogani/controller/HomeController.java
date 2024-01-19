package com.example.websiteogani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ogani")
public class HomeController {
    @GetMapping
    public String showPageIndex(){
        return "index";
    }
    @GetMapping("/home")
    public String redirectPageIndex(){
        return "redirect:/ogani";
    }
}
