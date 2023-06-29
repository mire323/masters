package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "veterinarian")
public class Veterinarian extends BaseEntity {
    private String firstName;
    private String lastName;
    private String specialization;
    private String phoneNumber;

    @OneToMany(mappedBy = "veterinarian")
    private List<Appointment> appointments;

    public Veterinarian(String john, String doe, String general, String phoneNumber) {
        super();
    }

    // Additional veterinarian-specific attributes and relationships
}
