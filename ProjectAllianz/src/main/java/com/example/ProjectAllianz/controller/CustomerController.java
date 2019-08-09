package com.example.ProjectAllianz.controller;


import com.example.ProjectAllianz.dto.CustomerDto;
import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.model.Funds;
import com.example.ProjectAllianz.service.CustomerService;


import com.example.ProjectAllianz.service.FundService;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    private ModelMapper modelMapper = new ModelMapper();


    @ApiOperation(value = "Information Customer", notes = "Information Customer test")
    @GetMapping(value = "/all")
    @ResponseBody
    public List<CustomerDto> getAllCustomer(){
        List<Customer> customers = customerService.getAllCustomer();
        return customers.stream().map(customer -> convertToDto(customer)).collect(Collectors.toList());
    }


    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto) throws ParseException{
        Customer customer = convertToEntity(customerDto);
        Customer customerCreate = customerService.addCustomer(customer);
        return convertToDto(customer);
    }
//
//
    @GetMapping(value = "/{id}")
    @ResponseBody
    public CustomerDto getCustomer(@PathVariable("id") int id){
        return convertToDto(customerService.getCustomerById(id));
    }

    @PutMapping(value = "/{id}" )
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody CustomerDto customerDto) throws ParseException{
        Customer customer = convertToEntity(customerDto);

    }

    private CustomerDto convertToDto(Customer customer){
        CustomerDto customerDto = modelMapper.map(customer, CustomerDto.class);
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setDateOfbirth(customer.getDateOfBirth());
        customerDto.setPreferredLanguages(customer.getPreferredLanguages());
        return customerDto;

    }

    private Customer convertToEntity(CustomerDto customerDto) throws ParseException{
        Customer customer = modelMapper.map(customerDto, Customer.class);

        if ((customerDto.getId()) !=  0){
            Customer oldCustomer = customerService.getCustomerById(customerDto.getId());
            customer.setId(oldCustomer.getId());

        }
        return customer;
    }


    /** ------------------------------------------------------
     * old code
     * information data
     */


//    @Autowired
//    private CustomerService customerService;


//    @Autowired
//    private CustomerService customerService;
////    private final CustomerMapper customerMapper;
//
//
//
//    @ApiOperation(value = "Information Customer", notes = "Information Customer test")
//    @GetMapping(value = "/all")
//    @ResponseBody
//    public List<Customer> getAllCustomer(){
////        List<Customer> customers = customerService.getAllCustomer();
////        return customers.stream()
////                .map(customer -> convertToDto(customer))
////                .collect(Collectors.toList());
//        return customerService.getAllCustomer();
//    }

//    @PostMapping(value = "/create" )
//    public List<Customer> createCustomer (@RequestBody Customer customer){
//        customerService.addCustomer(customer);
//        return customerService.getAllCustomer();
//    }

//    private CustomerDto convertToDto(Customer customer) {
//        CustomerDto customerDto = customerMapper.map(customer, CustomerDto.class);
//        customerDto.setSubmissionDate(post.getSubmissionDate(),
//                userService.getCurrentUser().getPreference().getTimezone());
//        return customerDto;
//    }


    /**
     * fund data
     */

//    @Autowired
//    private FundService fundService;
//
//    @GetMapping(value="/fund/all")
//    public List<Funds> getAllFunds(){
//        return fundService.getAllFunds();
//    }
//
//    @PostMapping(value = "/funds/create")
//    public List<Funds> createFund (@RequestBody Funds funds){
//        fundService.addFunds(funds);
//        return fundService.getAllFunds();
//    }


}
