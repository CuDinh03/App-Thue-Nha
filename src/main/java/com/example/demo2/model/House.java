package com.example.demo2.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
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

    @OneToMany(mappedBy = "house")
    private List<Image> image; // Ideally, this should be handled as a separate entity for better management

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

    // Getters and setters, constructors
}
