package com.example.db.entity;

import com.example.db.parententity.Address;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OfficialAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;

    public OfficialAddress() {
    }

    public OfficialAddress(int zipCode, String city, String streetName, byte houseNumber) {
        super(zipCode, city, streetName, houseNumber);
    }
}
