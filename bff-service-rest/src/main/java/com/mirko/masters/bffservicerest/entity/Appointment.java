package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "appointment")
public class Appointment extends BaseEntity {
    private LocalDateTime appointmentDateTime;
    private String description;

    @ManyToOne
    private Veterinarian veterinarian;

    // Additional appointment-specific attributes and relationships
}
