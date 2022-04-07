package com.example.db.parententity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Address {

private int zipCode;
private String city;
private String streetName;
private byte houseNumber;

}
