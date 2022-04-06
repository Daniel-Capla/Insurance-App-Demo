package com.example.db.entity;

import com.example.model.Contract;
import com.example.model.HomeType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class HomeContract extends Contract {

    @Id
    Long id;
    HomeType homeType;
    int price;
    //Address



}
