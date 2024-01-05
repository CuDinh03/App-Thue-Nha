package com.example.demo2.repository;

import com.example.demo2.model.Ward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IWardRepository extends JpaRepository<Ward, UUID> {
}
