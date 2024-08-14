package com.example.cubochalenger.service;


import com.example.cubochalenger.entity.Client;
import com.example.cubochalenger.entity.dto.ClientDTO;
import com.example.cubochalenger.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTests {


    @InjectMocks
    private ClientService service;

    @Mock
    private ClientRepository repository;

    private Client client;
    private ClientDTO clientDTO;

    @BeforeEach
    public void startUp(){
        client = new Client("Testes", "Teste1", new BigDecimal("20.0"));
        client.setId(1L);
        clientDTO = new ClientDTO("Testes", "Teste1", new BigDecimal("20.0"));
    }

    @Test
    public void saveClient(){

        when(this.repository.save(any(Client.class))).thenReturn(client);

        Client clientSaved = service.saveClient(clientDTO);

        assertEquals(clientSaved.getId(), client.getId());
        assertNotNull(clientSaved);
    }

    @Test
    public void findAllClients(){
        List<Client> clientList = List.of(client, client);
        when(this.repository.findAll()).thenReturn(clientList);

        List<Client> clients = service.listAllClient();
        assertNotNull(clients);
        assertNotNull(clients.get(0).getId());
    }
}
