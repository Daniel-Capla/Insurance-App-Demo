package com.example.db.repository;

import com.example.db.entity.TripContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripContractRepository extends JpaRepository<TripContract, Long> {
}
