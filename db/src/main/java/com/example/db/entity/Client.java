package com.example.db.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String dateOfBirth;

    @OneToOne(mappedBy = "client")
    private OfficialAddress officialAddress;

    @OneToOne(mappedBy = "client")
    private MailingAddress mailingAddress;

    @OneToMany(mappedBy = "client")
    private List<HomeContract> homeContracts = new ArrayList<>();

    @OneToMany(mappedBy = "client")
    private List<TripContract> tripContracts = new ArrayList<>();



}
