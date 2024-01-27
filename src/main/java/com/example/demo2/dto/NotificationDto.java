package com.example.demo2.dto;

import com.example.demo2.model.Account;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    private UUID id;
    private String content;
    private Account receiver;
    private LocalDateTime dateTime;
    private LocalDate createDate;
    private Date editDate;
}
