package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    // Additional custom query methods if needed
}
