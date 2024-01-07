package com.example.demo2.repository;

import com.example.demo2.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IReviewRepository extends JpaRepository<Review, UUID> {
}
