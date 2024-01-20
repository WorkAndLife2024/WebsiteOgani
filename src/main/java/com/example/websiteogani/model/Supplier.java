package com.example.websiteogani.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Entity
@Table(name = "Supplier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupplier;
    @Column(name = "supplierName",columnDefinition = "nvarchar(100)")
    private String supplierName;
    @Column(name = "contactPerson",columnDefinition = "nvarchar(100)")
    private String contactPerson;
    @Column(name = "phoneSupplier",columnDefinition = "varchar(15)")
    private String phoneSupplier;
    @Column(name = "addressSupplier",columnDefinition = "nvarchar(100)")
    private String addressSupplier;
}
