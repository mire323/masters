package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medication")
public class Medication extends BaseEntity {
    private String name;
    private String dosage;
    private String frequency;

    @ManyToOne
    private MedicalRecord medicalRecord;

    // Additional medication-specific attributes and relationships
}
