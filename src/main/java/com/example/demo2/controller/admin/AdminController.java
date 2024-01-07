package com.example.demo2.controller.admin;

import com.example.demo2.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @GetMapping("/home")
    public String admin() {
        return "admin/index";
    }

    @PostMapping("/save")
    public String save(){
        return "admin/index";
    }

}
