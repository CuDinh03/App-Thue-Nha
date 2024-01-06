package com.example.demo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty

    private String password;
    @NotEmpty

    private String name; //username
    @NotEmpty
    @Pattern(regexp = "/(0[3|5|7|8|9])+([0-9]{8})\\b/g")
    private String phoneNumber;
    private LocalDate createDate;
    private Date editDate;
    @NotEmpty
    private String address;
    private Boolean verified;
    private Boolean type;

}
