package com.example.rest;

import com.example.model.dto.ClientDTO;
import com.example.model.dto.ListResponseDTO;
import com.example.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/insured")
    public ResponseEntity<List<ListResponseDTO>> getInsured(){
        return clientService.getAllClients();
    }

    @PostMapping("/insured")
    public ResponseEntity addClient(@RequestBody ClientDTO clientDTO) {
        clientService.addNewClient(clientDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/insured/{id}")
    public ResponseEntity getDetailedView(@PathVariable Long id) {
        clientService.getDetailedCustomerView(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
