package com.mirko.masters.bffservicerest.service.impl;

import com.mirko.masters.bffservicerest.entity.Customer;
import com.mirko.masters.bffservicerest.entity.Veterinarian;
import com.mirko.masters.bffservicerest.repository.CustomerRepository;
import com.mirko.masters.bffservicerest.repository.VeterinarianRepository;
import com.mirko.masters.bffservicerest.service.CustomerService;
import com.mirko.masters.bffservicerest.service.VeterinarianService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarianServiceImpl implements VeterinarianService {

    private final VeterinarianRepository veterinarianRepository;

    public VeterinarianServiceImpl(VeterinarianRepository veterinarianRepository) {
        this.veterinarianRepository = veterinarianRepository;
    }

    @Override
    public Veterinarian createVeterinarian(Veterinarian veterinarian) {
        return veterinarianRepository.save(veterinarian);
    }

    @Override
    public List<Veterinarian> getVeterinarians() {
        return veterinarianRepository.findAll();
    }
}
