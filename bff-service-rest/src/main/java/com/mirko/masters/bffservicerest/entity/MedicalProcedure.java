package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medical_procedure")
public class MedicalProcedure extends BaseEntity {
    private String name;
    private String description;
    private String duration;


    // Additional medical procedure-specific attributes and relationships
}
