package com.example.demo2.repository;

import com.example.demo2.model.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LandlordRepository extends JpaRepository<Landlord, UUID> {
}
