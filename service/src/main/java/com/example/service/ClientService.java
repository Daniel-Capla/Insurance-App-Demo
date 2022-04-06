package com.example.service;

import com.example.db.entity.Client;
import com.example.db.repository.ClientRepository;
import com.example.model.DTO.ListResponseDTO;
import com.example.service.mapper.ClientMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    public ResponseEntity<List<ListResponseDTO>> getAllClients() {
        List<Client> clientList = clientRepository.getAll();
        List<ListResponseDTO> clientListWithoutContractDetails = new ArrayList<>();

        for (Client client :
                clientList) {
            ListResponseDTO listResponseDTO = clientMapper.clientToListResponseDTO(client);
            clientListWithoutContractDetails.add(listResponseDTO);
        }

        return ResponseEntity.status(200).body(clientListWithoutContractDetails);
    }


}
