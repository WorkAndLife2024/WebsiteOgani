package com.example.websiteogani.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    @Column(name = "productName",columnDefinition = "nvarchar(100)")
    private String productName;
    @Column(name = "productImage",columnDefinition = "nvarchar(255)")
    private String productImage;
    @Column(name = "productPrice")
    private Double productPrice;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "discount")
    private Double discount;
    @ManyToOne
    @JoinColumn(name = "Category",referencedColumnName = "idCategory")
    private Category idCategory;
    @ManyToOne
    @JoinColumn(name = "Supplier",referencedColumnName = "idSupplier")
    private Supplier idSupplier;
    @ManyToOne
    @JoinColumn(name = "Unit",referencedColumnName = "idUnit")
    private Unit idUnit;
}
