package com.tk.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome {
    
    @GetMapping(value = "/welcome")
    public String index(ModelAndView mv) {

        mv.addObject("name" ,"pooney.jsp");

        return "welcome";
    }
}
