package com.example.service.mapper;

import com.example.db.entity.Client;
import com.example.model.dto.DetailedViewResponseDTO;
import com.example.model.dto.ListResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ListResponseDTO clientToListResponseDTO(Client client);
    DetailedViewResponseDTO clientToDetailedViewResponseDTO (Client client);


}
