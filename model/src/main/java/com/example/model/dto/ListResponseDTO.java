package com.example.model.dto;

import com.example.db.entity.MailingAddress;
import com.example.db.entity.OfficialAddress;
import lombok.Data;


@Data
public class ListResponseDTO {

    private String name;
    private String surname;
    private String dateOfBirth;
    private OfficialAddress officialAddress;
    private MailingAddress mailingAddress;


}
