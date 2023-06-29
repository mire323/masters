package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    // Additional custom query methods if needed
}
