package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.model.Funds;
import com.example.ProjectAllianz.service.CustomerService;


import com.example.ProjectAllianz.service.FundService;
import io.swagger.annotations.ApiOperation;
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
//    private final CustomerMapper customerMapper;



    @ApiOperation(value = "Information Customer", notes = "Information Customer test")
    @GetMapping(value = "/all")
    @ResponseBody
    public List<Customer> getAllCustomer(){
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



    @Autowired
    private FundService fundService;

    @GetMapping(value="/fund/all")
    public List<Funds> getAllFunds(){
        return fundService.getAllFunds();
    }

    @PostMapping(value = "/funds/create")
    public List<Funds> createFund (@RequestBody Funds funds){
        fundService.addFunds(funds);
        return fundService.getAllFunds();
    }


}
