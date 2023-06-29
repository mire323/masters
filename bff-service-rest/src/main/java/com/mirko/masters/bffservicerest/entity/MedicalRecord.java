package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "medical_record")
public class MedicalRecord extends BaseEntity {
    private String diagnosis;
    private String treatment;
    private String notes;

    @ManyToOne
    private Pet pet;

    @OneToMany
    private List<MedicalProcedure> medicalProcedures;

    // Additional medical record-specific attributes and relationships
}
