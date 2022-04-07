package com.example.db.entity;

import com.example.db.parententity.Address;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailingAddress extends Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;

    public MailingAddress(int zipCode, String city, String streetName, byte houseNumber, Client client) {
        super(zipCode, city, streetName, houseNumber);
        this.client = client;
    }
}
