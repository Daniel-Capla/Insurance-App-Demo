package com.example.db.repository;

import com.example.db.entity.OfficialAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficialAddressRepository extends JpaRepository<OfficialAddress, Long> {
}
