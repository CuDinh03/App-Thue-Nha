package com.example.demo2.repository;

import com.example.demo2.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account , UUID> {
}
