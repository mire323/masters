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
@Table(name = "visit")
public class Visit extends BaseEntity {
    private LocalDateTime visitDateTime;
    private String reason;

    @ManyToOne
    private Pet pet;

    // Additional visit-specific attributes and relationships
}
