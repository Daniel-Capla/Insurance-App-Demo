package com.example.db.entity;

import com.example.db.parententity.Address;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailingAddress extends Address {
    @Id
    private Long id;

    @OneToOne
    private Client client;
}
