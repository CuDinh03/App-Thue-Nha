package com.example.demo2.dto;

import com.example.demo2.model.Landlord;
import com.example.demo2.model.Renter;

import java.util.UUID;

public class ReviewDto {
    private UUID id;

    private String content;
    private Integer rating;

    private Landlord reviewedLandlord;

    private Renter reviewingRenter;

    private boolean approved;
}
