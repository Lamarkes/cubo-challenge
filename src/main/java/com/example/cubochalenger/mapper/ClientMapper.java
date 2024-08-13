package com.example.cubochalenger.mapper;

import com.example.cubochalenger.entity.Client;
import com.example.cubochalenger.entity.dto.ClientDTO;

public class ClientMapper {


    public static Client entityToDto(ClientDTO dto){
        Client client = new Client();

        client.setFirstName(dto.firstName());
        client.setLastName(dto.lastName());
        client.setParticipation(dto.participation());

        return client;
    }
}
