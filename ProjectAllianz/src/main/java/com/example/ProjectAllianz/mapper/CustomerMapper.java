package com.example.ProjectAllianz.mapper;

import com.example.ProjectAllianz.dto.CustomerDTO;
import com.example.ProjectAllianz.model.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerDTO toProductDTO(Customer product);

    List<CustomerDTO> toCustomerDTOs(List<Customer> products);

    Customer toProduct(CustomerDTO customerDTO);
}