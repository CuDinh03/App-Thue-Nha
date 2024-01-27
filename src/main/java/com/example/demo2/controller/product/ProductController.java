package com.example.demo2.controller.product;

import com.example.demo2.dto.HouseDto;
import com.example.demo2.model.House;
import com.example.demo2.model.Image;
import com.example.demo2.repository.IHouseRepository;
import com.example.demo2.repository.ImageRepository;
import com.example.demo2.transfer.TransferData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    IHouseRepository iHouseRepository;

    @Autowired
    ImageRepository imageRepository;

    TransferData transferData;

    @GetMapping(value = "/list")
    public String showAllProduct(Model model){
        List<Image> listImage = imageRepository.findAll();
        model.addAttribute("listHouse", iHouseRepository.findAll());
        model.addAttribute("listImage",listImage );
        return "view/list-product";
    }

    @GetMapping(value = "/detail")
    public String detail (@RequestParam("id") UUID id, Model model){
        if (iHouseRepository.existsById(id)){
            HouseDto houseDto = new HouseDto();
            House house = iHouseRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("House not found with ID: " + id));
            houseDto = transferData.returnDto(house);
            model.addAttribute("house", houseDto);
        }
        return "view/product-details";
    }


}
