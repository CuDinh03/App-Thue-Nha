package com.example.demo2.repository;

import com.example.demo2.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPaymentRepository extends JpaRepository<Payment, UUID> {
}
