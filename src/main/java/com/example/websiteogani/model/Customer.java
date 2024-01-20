package com.example.websiteogani.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    @ManyToOne
    @JoinColumn(name = "Account",referencedColumnName = "idAccount")
    private Account idAccount;
    @Column(name = "fullname", columnDefinition = "nvarchar(100)")
    private String fullname;
    @Column(name = "phoneNumber",columnDefinition = "varchar(15)")
    private String phoneNumber;
    @Column(name = "address",columnDefinition = "nvarchar(150)")
    private String address;
}
