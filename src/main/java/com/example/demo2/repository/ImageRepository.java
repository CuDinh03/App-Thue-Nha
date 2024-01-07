package com.example.demo2.repository;

import com.example.demo2.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface ImageRepository extends JpaRepository<Image, UUID> {
}
