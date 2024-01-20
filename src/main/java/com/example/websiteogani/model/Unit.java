package com.example.websiteogani.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Unit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnit;
    @Column(name = "unitName",columnDefinition = "nvarchar(50)")
    private String unitName;
    @Column(name = "description",columnDefinition = "nvarchar(50)")
    private String description;
}
