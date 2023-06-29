package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.MedicalProcedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalProcedureRepository extends JpaRepository<MedicalProcedure, Long> {
    // Additional custom query methods if needed
}
