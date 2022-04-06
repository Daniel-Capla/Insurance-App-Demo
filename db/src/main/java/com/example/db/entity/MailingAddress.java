package com.example.db.entity;

import com.example.model.Address;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailingAddress extends Address {
    @Id
    Long id;
}
