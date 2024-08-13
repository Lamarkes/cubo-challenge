package com.example.cubochalenger.repository;

import com.example.cubochalenger.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
