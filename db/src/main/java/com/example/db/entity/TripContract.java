package com.example.db.entity;

import com.example.model.Contract;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TripContract extends Contract {

    @Id
    private Long id;
    private String startDate;
    private String endDate;
    private boolean liability;
    private boolean injury;

    @ManyToOne
    private Client client;

}
