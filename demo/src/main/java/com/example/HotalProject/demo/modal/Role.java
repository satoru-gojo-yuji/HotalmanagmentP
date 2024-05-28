package com.example.HotalProject.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Role {

    @Id
    int id ;
    String name ;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
