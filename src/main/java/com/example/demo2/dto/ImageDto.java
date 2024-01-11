package com.example.demo2.dto;

import com.example.demo2.model.House;
import lombok.*;

import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {
    private UUID id;

    private String imagePath;

    private House house;
}
