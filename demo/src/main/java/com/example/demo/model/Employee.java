package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
