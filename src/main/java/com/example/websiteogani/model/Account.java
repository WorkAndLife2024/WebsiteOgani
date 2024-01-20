package com.example.websiteogani.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "Account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    @Column(name = "username",columnDefinition = "varchar(150)")
    private String username;
    @Column(name = "password",columnDefinition = "varchar(150)")
    private String password;
    @Column(name = "email",columnDefinition = "varchar(150)")
    private String email;
    private LocalDateTime dateCreate;
    private LocalDateTime lastLogin;
    @ManyToOne
    @JoinColumn(name = "Role",referencedColumnName = "idRole")
    private Role roleName;
}
