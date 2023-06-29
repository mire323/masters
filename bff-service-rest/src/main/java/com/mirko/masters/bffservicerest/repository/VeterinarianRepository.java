package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long> {
    // Additional custom query methods if needed
}
