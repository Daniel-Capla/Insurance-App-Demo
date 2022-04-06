package com.example.service.mapper;

import com.example.db.entity.Client;
import com.example.model.DTO.ListResponseDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {

    ListResponseDTO listResponseDTO(Client client);


}
