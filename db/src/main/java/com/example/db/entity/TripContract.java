package com.example.db.entity;

import com.example.db.parententity.Contract;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TripContract extends Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    private boolean liability;
    private boolean injury;

    @ManyToOne
    private Client client;

}
