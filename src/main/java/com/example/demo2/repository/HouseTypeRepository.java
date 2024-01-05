package com.example.demo2.repository;

import com.example.demo2.model.HouseType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HouseTypeRepository extends JpaRepository<HouseType, UUID> {
}
