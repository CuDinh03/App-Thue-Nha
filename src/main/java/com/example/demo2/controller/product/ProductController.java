package com.example.demo2.controller.product;

import com.example.demo2.model.Image;
import com.example.demo2.repository.IHouseRepository;
import com.example.demo2.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    IHouseRepository iHouseRepository;

    @Autowired
    ImageRepository imageRepository;

    @GetMapping(value = "/list")
    public String showAllProduct(Model model){
        List<Image> listImage = imageRepository.findAll();
        model.addAttribute("listHouse", iHouseRepository.findAll());
        model.addAttribute("listImage",listImage );
        return "view/list-product";
    }

    @GetMapping(value = "/detail")
    public String detail (){
        return "view/product-details";
    }
}
