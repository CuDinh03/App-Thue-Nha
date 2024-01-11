package com.example.demo2.repository;

import com.example.demo2.model.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface IStreetRepository extends JpaRepository<Street, UUID> {
}
