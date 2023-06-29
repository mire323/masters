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
@Table(name = "medical_test")
public class MedicalTest extends BaseEntity {
    private String name;
    private String description;
    private String result;

    @ManyToOne
    private MedicalRecord medicalRecord;

    // Additional medical test-specific attributes and relationships
}
