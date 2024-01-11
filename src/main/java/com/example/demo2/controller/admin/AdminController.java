package com.example.demo2.controller.admin;

import com.example.demo2.dto.HouseDto;
import com.example.demo2.model.House;
import com.example.demo2.repository.IAccountRepository;
import com.example.demo2.repository.IHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    IHouseRepository iHouseRepository;

    @GetMapping("/home")
    public String admin(Model model) {
        model.addAttribute("listHouse", iHouseRepository.findAll());
        return "admin/index";
    }

    @GetMapping("/create")
    public String createPage(Model model){
        HouseDto house = new HouseDto();
        model.addAttribute("house", house);
        return "admin/insert";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("house") HouseDto houseDto, ModelMap modelMap){

        HouseDto house = houseDto;

        return "admin/index";
    }

}
