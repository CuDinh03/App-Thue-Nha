package com.example.demo2.repository;

import com.example.demo2.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IHouseRepository extends JpaRepository<House, UUID> {
}
