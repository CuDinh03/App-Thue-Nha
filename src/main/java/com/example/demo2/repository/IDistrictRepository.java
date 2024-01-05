package com.example.demo2.repository;

import com.example.demo2.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IDistrictRepository extends JpaRepository<District, UUID> {
}
