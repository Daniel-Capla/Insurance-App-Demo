package com.example.db.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    Long id;
    private String name;
    private String surname;
    private String dateOfBirth;

    //OfficialAddress
    //MailingAddress
    //HomeContract
    //TripContract



}
