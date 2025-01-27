package com.arul.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String email;





 // Getters
 public Long getId() {
    return id;
}

public String getUsername() {
    return username;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

// Setters
public void setId(Long id) {
    this.id = id;
}

public void setUsername(String username) {
    this.username = username;
}

public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}

}
