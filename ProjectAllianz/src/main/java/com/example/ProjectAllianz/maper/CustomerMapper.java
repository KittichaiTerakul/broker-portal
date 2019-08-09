package com.example.ProjectAllianz.maper;

import com.example.ProjectAllianz.dto.CustomerDto;
import com.example.ProjectAllianz.model.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDto toCustomerDTO(Customer customer);
    List<Customer> toCustomerDTOs(List<Customer> customers);
    Customer toCustomer(CustomerDto customerDto);
}
