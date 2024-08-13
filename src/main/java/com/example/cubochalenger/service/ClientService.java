package com.example.cubochalenger.service;

import com.example.cubochalenger.entity.Client;
import com.example.cubochalenger.entity.dto.ClientDTO;
import com.example.cubochalenger.exception.ExceptionResponseHandler;
import com.example.cubochalenger.mapper.ClientMapper;
import com.example.cubochalenger.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;


    public Client saveClient(ClientDTO data){
        if (data.firstName() == null
                || data.lastName() == null
                || data.participation() == null) throw new NullPointerException();

        Client client = ClientMapper.entityToDto(data);
        return repository.save(client);
    }


    public List<Client> listAllClient(){
        return repository.findAll();
    }

}
