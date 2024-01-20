package com.example.websiteogani.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
    @Column(name = "categoryName", columnDefinition = "nvarchar(100)")
    private String categoryName;
    @ManyToOne
    @JoinColumn(name = "Item", referencedColumnName = "itemName")
    private Item idItem;
}
