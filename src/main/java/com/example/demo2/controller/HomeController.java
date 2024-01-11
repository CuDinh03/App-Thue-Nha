package com.example.demo2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {
    @GetMapping (value = "/home")

    public String home(Model model){
//        model.addAttribute("msg","homePage");
        return "view/index";
    }



}
