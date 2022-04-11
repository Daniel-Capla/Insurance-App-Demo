package com.example.model.dto;

import com.example.db.entity.HomeContract;
import com.example.db.entity.MailingAddress;
import com.example.db.entity.OfficialAddress;
import com.example.db.entity.TripContract;
import lombok.Data;

import java.util.List;

@Data
public class DetailedViewResponseDTO {

    private String name;
    private String surname;
    private String dateOfBirth;
    private OfficialAddress officialAddress;
    private MailingAddress mailingAddress;
    private List<HomeContract> homeContracts;
    private List<TripContract> tripContracts;
}
