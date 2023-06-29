package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
    // Additional custom query methods if needed
}
