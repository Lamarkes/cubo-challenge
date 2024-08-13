package com.example.cubochalenger.repository;

import com.example.cubochalenger.entity.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ClientRepositoryTests {

    @Autowired
    private ClientRepository clientRepository;


    private Client client;

    @BeforeEach
    public void startUp(){
        this.client = new Client("Client", "Test", new BigDecimal("20.0"));

    }

    @Test
    public void saveClient(){

        Client savedClient = clientRepository.save(client);

        assertNotNull(savedClient);
        assertEquals(savedClient, client);
        assertNotNull(savedClient.getId());
    }

    @Test
    public void findAllClients(){
        Client savedClient = clientRepository.save(client);
        Client savedClient2 = clientRepository.save(client);

        List<Client> allClients = clientRepository.findAll();

        assertEquals(allClients.get(0), savedClient);
        assertEquals(allClients.size(), clientRepository.count());
    }

}
