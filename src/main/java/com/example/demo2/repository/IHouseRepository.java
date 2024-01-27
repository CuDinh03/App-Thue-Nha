package com.example.demo2.repository;

import com.example.demo2.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository

public interface IHouseRepository extends JpaRepository<House, UUID> {


    @Query("select u from House u where u.status = true ")
    List<House> getAllByStatus();

    @Modifying
    @Query(value = "UPDATE House u  SET u.status = 0 WHERE u.id = ?",
            nativeQuery = true)
    void updateByStatus(UUID id);
}
