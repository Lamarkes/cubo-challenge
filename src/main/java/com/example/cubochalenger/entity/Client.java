package com.example.cubochalenger.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    
    private String lastName;
    
    private BigDecimal participation;

    public Client(){}

    public Client(String firstName, String lastName, BigDecimal participation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.participation = participation;
    }
}
