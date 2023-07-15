package com.tk.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    
    @GetMapping(value = "/welcome")
    public String index() {
        return "welcome";
    }
}
