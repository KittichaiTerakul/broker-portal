package com.example.ProjectAllianz.controller;

import com.example.ProjectAllianz.dto.CustomerDto;
import com.example.ProjectAllianz.maper.CustomerMapper;
import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.service.CustomerService;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

//    @Autowired
//    private CustomerService customerService;


    @Autowired
    private CustomerService customerService;

    private CustomerMapper customerMapper;



    @GetMapping(value = "/all")
    @ResponseBody
    public List<Customer> getAll(){
//        List<Customer> customers = customerService.getAllCustomer();
//        return customers.stream()
//                .map(customer -> convertToDto(customer))
//                .collect(Collectors.toList());
        return customerService.getAllCustomer();
    }

    @PostMapping(value = "/create" )
    public List<Customer> createCustomer (@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return customerService.getAllCustomer();
    }

//    private CustomerDto convertToDto(Customer customer) {
//        CustomerDto customerDto = customerMapper.map(customer, CustomerDto.class);
//        customerDto.setSubmissionDate(post.getSubmissionDate(),
//                userService.getCurrentUser().getPreference().getTimezone());
//        return customerDto;
//    }


}
