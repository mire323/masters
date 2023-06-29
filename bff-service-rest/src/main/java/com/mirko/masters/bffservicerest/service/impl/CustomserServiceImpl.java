package com.mirko.masters.bffservicerest.service.impl;

import com.mirko.masters.bffservicerest.entity.Customer;
import com.mirko.masters.bffservicerest.repository.CustomerRepository;
import com.mirko.masters.bffservicerest.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomserServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomserServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
