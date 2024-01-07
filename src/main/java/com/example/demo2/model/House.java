package com.example.demo2.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class House implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String address;
    private String description;
    private Integer numberOfRooms;
    private Double roomArea;
    private LocalDate createdDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractNumber;
    private Double depositAmount;
    private Double monthlyRentAmount;
    private Double serviceCharge;
    private String rentStatus;

    @OneToMany(mappedBy = "house")
    private List<Image> image;
    @ManyToOne
    private HouseType houseType;

    @ManyToOne
    private Province province;

    @ManyToOne
    private City city;

    @ManyToOne
    private District district;

    @ManyToOne
    private Ward ward;

    @ManyToOne
    private Street street;

    @ManyToOne
    private Landlord landlord;

    private LocalDate createDate;
    private Date editDate;}
