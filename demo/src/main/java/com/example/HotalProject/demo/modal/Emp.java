package com.example.HotalProject.demo.modal;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Emp {

    @Id
    int id ;

    @Column(name = "name")
    String name ;

    @Column(name = "email")
    String emailid ;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }



}
