package com.example.demo2.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @GetMapping(value = "/list")
    public String showAllProduct(){
        return "view/list-product";
    }

    @GetMapping(value = "/detail")
    public String detail (){
        return "view/product-details";
    }
}
