package com.example.cubochalenger.controller;


import com.example.cubochalenger.entity.Client;
import com.example.cubochalenger.entity.dto.ClientDTO;
import com.example.cubochalenger.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client/v1")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO data){
        Client client = service.saveClient(data);
        return ResponseEntity.ok().body(client);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Client>> listAllClients(){
        List<Client> clients = service.listAllClient();
        return ResponseEntity.ok().body(clients);
    }
}
