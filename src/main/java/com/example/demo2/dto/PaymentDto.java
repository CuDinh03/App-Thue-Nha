package com.example.demo2.dto;

import com.example.demo2.model.House;
import com.example.demo2.model.Renter;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.UUID;

public class PaymentDto {
    private UUID id;

    private Renter renter;

    private House house;

    private double amount;

    private LocalDate transactionDate;

    private String contractNumber;

    private String status;
}
