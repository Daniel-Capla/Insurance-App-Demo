package com.example.db.entity;

import com.example.db.parententity.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MailingAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JsonIgnore
    private Client client;

    public MailingAddress(int zipCode, String city, String streetName, byte houseNumber, Client client) {
        super(zipCode, city, streetName, houseNumber);
        this.client = client;
    }
}
