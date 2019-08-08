package com.example.ProjectAllianz.controller;

import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.repository.CustomerRepository;
import com.example.ProjectAllianz.service.CustomerService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerService.getAllCustomer();
    }

    @PostMapping(value = "/create" )
    public List<Customer> createCustomer (@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return customerService.getAllCustomer();
    }


}
