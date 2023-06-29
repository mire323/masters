package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Additional custom query methods if needed
}
