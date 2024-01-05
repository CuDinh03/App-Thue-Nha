package com.example.demo2.controller.staff;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/staff"})
public class StaffController {

    @GetMapping("/home")
    public String home(){
        return "staff/index";
    }
}
