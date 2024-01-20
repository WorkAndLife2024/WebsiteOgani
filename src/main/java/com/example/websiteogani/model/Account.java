package com.example.websiteogani.model;

import java.time.LocalDateTime;

public class Account {
    private Long idAccount;
    private String username;
    private String password;
    private String email;
    private LocalDateTime dateCreate;
    private LocalDateTime lastLogin;
    private Role roleName;
}
