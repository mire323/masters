package com.mirko.masters.bffservicerest.entity;

import com.mirko.vet.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "invoice")
public class Invoice extends BaseEntity {
    private LocalDate invoiceDate;
    private BigDecimal totalAmount;

    @ManyToOne
    private Customer customer;

    // Additional invoice-specific attributes and relationships
}
