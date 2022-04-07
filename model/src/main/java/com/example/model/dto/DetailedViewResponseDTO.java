package com.example.model.dto;

import com.example.db.entity.MailingAddress;
import com.example.db.entity.OfficialAddress;
import lombok.Data;

import java.util.List;

@Data
public class DetailedViewResponseDTO {

    private String name;
    private String surname;
    private String dateOfBirth;
    private OfficialAddress officialAddress;
    private MailingAddress mailingAddress;
    private List<OfficialAddress> officialAddressList;
    private List<MailingAddress> mailingAddressList;
}
