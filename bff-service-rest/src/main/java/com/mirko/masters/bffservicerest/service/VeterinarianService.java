package com.mirko.masters.bffservicerest.service;

import com.mirko.masters.bffservicerest.entity.Customer;
import com.mirko.masters.bffservicerest.entity.Veterinarian;

import java.util.List;

public interface VeterinarianService {
    Veterinarian createVeterinarian(Veterinarian veterinarian);
    List<Veterinarian> getVeterinarians();

}
