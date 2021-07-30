package com.example.fitness.mapper;

import com.example.fitness.dto.CustomerRequest;
import com.example.fitness.dto.CustomerResponse;
import com.example.fitness.entity.Customer;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper map = Mappers.getMapper(CustomerMapper.class);

    CustomerResponse customerToCustomerResponse(Customer customer);

    Customer customerRequestToCustomer(CustomerRequest customerRequest);

}
