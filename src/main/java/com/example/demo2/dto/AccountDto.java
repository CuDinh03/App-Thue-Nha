package com.example.demo2.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private UUID id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDate createDate;
    private Date editDate;
    private String address;
    private boolean verified;
    private Boolean type;

}
