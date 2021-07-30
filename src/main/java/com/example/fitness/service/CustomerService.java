package com.example.fitness.service;

import com.example.fitness.dto.CustomerRequest;
import com.example.fitness.dto.CustomerResponse;

public interface CustomerService {
//    CustomerResponse getCustomerById(String customerId);

    CustomerResponse saveCustomer(CustomerRequest customerRequest);
}
