package com.example.db.repository;

import com.example.db.entity.MailingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailingAddressRepository extends JpaRepository<MailingAddress, Long> {
}
