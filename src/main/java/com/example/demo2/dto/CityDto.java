package com.example.demo2.dto;

import lombok.*;

import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    private UUID id;

    private String name;
}
