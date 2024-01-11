package com.example.demo2.dto;

import com.example.demo2.model.*;
import com.example.demo2.model.District;
import lombok.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HouseDto {
    private UUID id;
    private String name;
    private String address;
    private String description;
    private Integer numberOfRooms; //bedroom
    private Double roomArea; //area
    private LocalDate createdDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractNumber;
    private Double depositAmount; // tien coc, price
    private Double monthlyRentAmount;
    private Double serviceCharge;
    private String rentStatus;
    private List<Image> image;
    private HouseType houseType;
    private Province province;
    private City city;
    private District district;
    private Ward ward;
    private Street street;
    private Landlord landlord;

    private LocalDate createDate;
    private Date editDate;

}
