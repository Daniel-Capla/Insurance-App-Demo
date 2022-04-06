package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {


    @GetMapping("/insured")
    public ResponseEntity getInsured(){

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/isnured")
    public ResponseEntity addClient() {


        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/insured/{id}")
    public ResponseEntity getDetailedView() {

        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
