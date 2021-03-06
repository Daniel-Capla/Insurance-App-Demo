package com.example.db.repository;

import com.example.db.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client getById(Long id);
    Client findClientByNameAndSurname(String name, String surname);
}
