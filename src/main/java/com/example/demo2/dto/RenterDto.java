package com.example.demo2.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RenterDto {
    private UUID id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private LocalDate birthDate;
}
