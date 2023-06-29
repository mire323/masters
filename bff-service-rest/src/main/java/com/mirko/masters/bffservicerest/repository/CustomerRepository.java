package com.mirko.masters.bffservicerest.repository;

import com.mirko.masters.bffservicerest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
