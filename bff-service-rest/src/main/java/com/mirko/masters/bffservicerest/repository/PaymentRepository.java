package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Additional custom query methods if needed
}
