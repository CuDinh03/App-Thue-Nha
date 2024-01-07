package com.example.demo2.repository;

import com.example.demo2.model.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IRenterRepository extends JpaRepository<Renter, UUID> {
}
