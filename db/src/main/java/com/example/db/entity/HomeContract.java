package com.example.db.entity;

import com.example.db.parententity.Contract;
import com.example.db.parententity.HomeType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HomeContract extends Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private HomeType homeType;
    private int price;

    @OneToOne
    private OfficialAddress officialAddress;

    @ManyToOne
    @JsonIgnore
    private Client client;

    public HomeContract(HomeType homeType, int price, OfficialAddress officialAddress, Client client) {
        this.homeType = homeType;
        this.price = price;
        this.officialAddress = officialAddress;
        this.client = client;
    }
}
