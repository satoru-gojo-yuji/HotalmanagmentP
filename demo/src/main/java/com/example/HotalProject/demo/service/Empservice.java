package com.example.HotalProject.demo.service;


import com.example.HotalProject.demo.modal.Emp;
import com.example.HotalProject.demo.repositery.Emprpositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Empservice {

    // to performe backend logic
@Autowired
private Emprpositery e ;
    /* Emp n =new Emp(5 ,"abhi" ,  "abhi@gmail.com");
  // e.save(n);
    public void savedata(Emp emp)
    {

     e.save(emp) ; // Emp n =new Emp(5 ,"abhi" ,  "abhi@gmail.com");


    }*/

    public List<Emp> getAllBooks()
    {
        List<Emp> books = new ArrayList<Emp>();
        e.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public void saveOrUpdate(Emp emp)
    {
       e.save(emp);
    }
}
