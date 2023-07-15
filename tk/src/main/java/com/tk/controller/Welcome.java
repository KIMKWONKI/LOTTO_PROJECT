package com.tk.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
    
    @RequestMapping(value = "/welcome")
    public String index(Model mv) {
        mv.addAttribute("name" ,"pooney.j11p");
        return "thymeleaf/welcome";
    }
}
