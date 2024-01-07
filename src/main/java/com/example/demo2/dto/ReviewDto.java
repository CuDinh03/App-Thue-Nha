package com.example.demo2.dto;

import com.example.demo2.model.Landlord;
import com.example.demo2.model.Renter;
import lombok.*;

import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private UUID id;

    private String content;
    private Integer rating;

    private Landlord reviewedLandlord;

    private Renter reviewingRenter;

    private boolean approved;
}
