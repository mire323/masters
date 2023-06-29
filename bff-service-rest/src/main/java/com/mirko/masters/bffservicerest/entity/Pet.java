package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pet")
public class Pet extends BaseEntity {
    private String name;
    private String species;
    private String breed;
    private int age;
    // Additional pet-specific attributes and relationships
}
