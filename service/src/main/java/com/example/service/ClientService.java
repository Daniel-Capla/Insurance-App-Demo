package com.example.service;

import com.example.db.entity.Client;
import com.example.db.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public ResponseEntity getAllClients() {

        List<Client> clientList = clientRepository.getAll();
        List<Client> clientListWithoutContractDetails = new ArrayList<>();

        for (Client client :
                clientList) {

            //TODO:Create mapper, create DTOs, map entities do DTOs

            //clientListWithoutContractDetails.add()

        }

        return ResponseEntity.status(200).build();
    }

}
