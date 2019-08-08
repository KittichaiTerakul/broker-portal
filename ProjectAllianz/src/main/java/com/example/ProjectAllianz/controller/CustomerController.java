package com.example.ProjectAllianz.controller;

import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.repository.CustomerRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping(value = "/create" )
    public List<Customer> createCustomer (@RequestBody Customer customer){
        customerRepository.save(customer);
        return customerRepository.findAll();
    }


}
