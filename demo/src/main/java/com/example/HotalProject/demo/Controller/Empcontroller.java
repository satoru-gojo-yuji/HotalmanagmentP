package com.example.HotalProject.demo.Controller;



import com.example.HotalProject.demo.modal.Emp;
import com.example.HotalProject.demo.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Empcontroller {

    @Autowired
    Empservice T ;
    @GetMapping("/empdata")
    private List<Emp> getAllBooks() {
        return T.getAllBooks();
    }

    @PostMapping("/add")
   public Emp saveBook(@RequestBody Emp emp)
    {
        T.saveOrUpdate(emp);
        return  emp;
    }
}
