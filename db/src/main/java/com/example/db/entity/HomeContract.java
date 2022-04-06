package com.example.db.entity;

import com.example.db.parententity.Contract;
import com.example.db.parententity.HomeType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HomeContract extends Contract {

    @Id
    private Long id;
    private HomeType homeType;
    private int price;
    //Address

    @ManyToOne
    private Client client;



}
