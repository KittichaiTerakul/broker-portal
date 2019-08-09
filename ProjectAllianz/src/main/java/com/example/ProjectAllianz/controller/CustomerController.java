package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.service.CustomerService;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

//    @Autowired
//    private CustomerService customerService;


    @Autowired
    private CustomerService customerService;
//    private final CustomerMapper customerMapper;



    @ApiOperation(value = "Information Customer", notes = "Information Customer test")
    @GetMapping(value = "/all")
    @ResponseBody
    public List<Customer> getAll(){
//        List<Customer> customers = customerService.getAllCustomer();
//        return customers.stream()
//                .map(customer -> convertToDto(customer))
//                .collect(Collectors.toList());
        return customerService.getAllCustomer();
    }
//    public ResponseEntity<List<>>

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
