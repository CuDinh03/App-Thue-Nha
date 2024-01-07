package com.example.demo2.repository;

import com.example.demo2.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IAccountRepository extends JpaRepository<Account , UUID> {
}
