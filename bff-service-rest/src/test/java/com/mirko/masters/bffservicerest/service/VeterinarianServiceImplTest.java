package com.mirko.masters.bffservicerest.service;

import com.mirko.masters.bffservicerest.entity.Veterinarian;
import com.mirko.masters.bffservicerest.repository.VeterinarianRepository;
import com.mirko.masters.bffservicerest.service.impl.VeterinarianServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class VeterinarianServiceImplTest {

    @Mock
    private VeterinarianRepository veterinarianRepository;

    private VeterinarianServiceImpl veterinarianService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        veterinarianService = new VeterinarianServiceImpl(veterinarianRepository);
    }

    @Test
    void testCreateVeterinarian() {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setFirstName("John");
        veterinarian.setLastName("Doe");
        veterinarian.setSpecialization("General");
        veterinarian.setPhoneNumber("123456789");

        when(veterinarianRepository.save(veterinarian)).thenReturn(veterinarian);

        Veterinarian createdVeterinarian = veterinarianService.createVeterinarian(veterinarian);

        verify(veterinarianRepository, times(1)).save(veterinarian);
        assertEquals(veterinarian, createdVeterinarian);
    }

    @Test
    void testGetVeterinarians() {
        List<Veterinarian> veterinarians = new ArrayList<>();
        veterinarians.add(new Veterinarian("John", "Doe", "General", "123456789"));
        veterinarians.add(new Veterinarian("Jane", "Smith", "Dentistry", "987654321"));

        when(veterinarianRepository.findAll()).thenReturn(veterinarians);

        List<Veterinarian> retrievedVeterinarians = veterinarianService.getVeterinarians();

        verify(veterinarianRepository, times(1)).findAll();
        assertEquals(veterinarians, retrievedVeterinarians);
    }
}

