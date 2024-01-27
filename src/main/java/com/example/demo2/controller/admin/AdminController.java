package com.example.demo2.controller.admin;

import com.example.demo2.dto.HouseDto;
import com.example.demo2.dto.ImageDto;
import com.example.demo2.model.House;
import com.example.demo2.model.Image;
import com.example.demo2.repository.IAccountRepository;
import com.example.demo2.repository.IHouseRepository;
import com.example.demo2.transfer.TransferData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    IHouseRepository iHouseRepository;

    TransferData data = new TransferData();

    @GetMapping("/home")
    public String admin(Model model) {
        model.addAttribute("listHouse", iHouseRepository.getAllByStatus());
        return "admin/index";
    }

    @GetMapping("/create")
    public String createPage(Model model){
        HouseDto houseDto = new HouseDto();
        ImageDto imageDto = new ImageDto();
        model.addAttribute("image",imageDto);
        model.addAttribute("house", houseDto);
        return "admin/insert";
    }

    @PostMapping("/create")
    public String save(@RequestParam("name") String name,
                       @RequestParam("depositAmount") String depositAmount,
                       @RequestParam("address") String address,
                       @RequestParam("room") String numberOfRooms,
                       @RequestParam("area") String roomArea){

        HouseDto input = new HouseDto();
        input.setName(name);
        input.setDepositAmount(Double.valueOf(depositAmount));
        input.setAddress(address);
        input.setNumberOfRooms(Integer.valueOf(numberOfRooms));
        input.setRoomArea(Double.valueOf(roomArea));
        input.setMonthlyRentAmount(Double.valueOf(5));
        input.setServiceCharge(Double.valueOf(6));
        House house = data.returnEntity(input);
        iHouseRepository.save(house);
        return "redirect:/admin/home";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("id")UUID id, Model model){
        if (iHouseRepository.existsById(id)){

        }
        return "";
    }

    @PostMapping("/update")
    public String update (){
        return "";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
//            HouseDto houseDto = new HouseDto();
//            houseDto.setId(id);
//            House house =  iHouseRepository.findById(id)
//                    .orElseThrow(() -> new RuntimeException("House not found with ID: " + id));

            iHouseRepository.updateByStatus(id);
        System.out.println(id);


        return "redirect:/admin/home";
    }



}
