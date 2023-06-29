package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @Embedded
    private Address address;

    // Additional customer-specific attributes and relationships
}
