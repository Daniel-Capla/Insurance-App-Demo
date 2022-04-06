package com.example.db.entity;

import com.example.model.Address;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class OfficialAddress extends Address {
    @Id
    Long id;
}
