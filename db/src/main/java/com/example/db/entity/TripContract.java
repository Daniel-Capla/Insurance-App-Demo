package com.example.db.entity;

import com.example.model.Contract;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class TripContract extends Contract {

    @Id
    Long id;
    String startDate;
    String endDate;
    boolean liability;
    boolean injury;


}
