package com.example.HotalProject.demo.repositery;


import com.example.HotalProject.demo.modal.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emprpositery extends JpaRepository<Emp, Integer> {

// CRUD operation


}
