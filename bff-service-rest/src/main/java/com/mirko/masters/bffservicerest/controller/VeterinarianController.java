package com.mirko.masters.bffservicerest.controller;

import com.mirko.masters.bffservicerest.controller.requests.LoginRequest;
import com.mirko.masters.bffservicerest.entity.Customer;
import com.mirko.masters.bffservicerest.entity.Veterinarian;
import com.mirko.masters.bffservicerest.service.CustomerService;
import com.mirko.masters.bffservicerest.service.VeterinarianService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/veterinarians")
public class VeterinarianController {
    private VeterinarianService veterinarianService;

    @PostMapping
    public ResponseEntity<Veterinarian> createVeterinarian(@RequestBody Veterinarian veterinarian) {
        Veterinarian savedVet = veterinarianService.createVeterinarian(veterinarian);
        return new ResponseEntity<>(savedVet, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Veterinarian>> getVeterinarians() {
        List<Veterinarian> vets = veterinarianService.getVeterinarians();
        return ResponseEntity.ok(vets);
    }
}
