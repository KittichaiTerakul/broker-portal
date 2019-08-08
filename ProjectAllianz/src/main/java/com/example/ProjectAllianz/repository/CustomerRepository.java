package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
