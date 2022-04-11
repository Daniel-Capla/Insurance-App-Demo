package com.example.db.entity;

import com.example.db.parententity.Contract;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Client client;

    public TripContract(String startDate, String endDate, boolean liability, boolean injury, Client client) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.liability = liability;
        this.injury = injury;
        this.client = client;
    }
}
