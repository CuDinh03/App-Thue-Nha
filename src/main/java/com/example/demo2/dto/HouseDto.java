package com.example.demo2.dto;

import com.example.demo2.model.*;
import com.example.demo2.model.District;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class HouseDto {
    private UUID id;
    private String name;
    private String address;
    private String description;
    private int numberOfRooms;
    private double roomArea;
    private LocalDate createdDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractNumber;
    private double depositAmount;
    private double monthlyRentAmount;
    private double serviceCharge;
    private String rentStatus;

    private List<Image> image;

    private HouseType houseType;

    private Province province;

    private City city;

    private District district;

    private Ward ward;

    private Street street;

    private Landlord landlord;

}
