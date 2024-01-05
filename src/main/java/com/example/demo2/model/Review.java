package com.example.demo2.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String content;
    private Integer rating;

    @ManyToOne
    private Landlord reviewedLandlord;

    @ManyToOne
    private Renter reviewingRenter;

    private boolean approved;

    private LocalDate createDate;
    private Date editDate;
}
