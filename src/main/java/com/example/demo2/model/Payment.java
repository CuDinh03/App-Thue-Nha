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
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Renter renter;

    @ManyToOne
    private House house;

    private Double amount;

    private LocalDate transactionDate;

    private String contractNumber;

    private Boolean status;
    private LocalDate createDate;
    private Date editDate;

}
