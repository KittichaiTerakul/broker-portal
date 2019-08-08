package com.example.ProjectAllianz.service;

import com.example.ProjectAllianz.model.Customer;
import com.example.ProjectAllianz.repository.CustomerRepository;
import com.example.ProjectAllianz.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;



    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(int id){
        customerRepository.deleteById(id);
    }

    public Customer updateEmployeeById(int id , Customer customer){
        customerRepository.findById(id).ifPresent(e -> customer.setId(e.getId()));
        return  customerRepository.save(customer);
    }


}
