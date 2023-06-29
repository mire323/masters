package com.mirko.masters.bffservicerest.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    // Additional address fields
}
