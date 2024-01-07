package com.example.demo2.repository;

import com.example.demo2.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProvinceRepository extends JpaRepository<Province, UUID> {
}
