package com.example.fitness.service.impl;

import com.example.fitness.dto.CustomerRequest;
import com.example.fitness.dto.CustomerResponse;
import com.example.fitness.entity.Customer;
import com.example.fitness.mapper.CustomerMapper;
import com.example.fitness.repository.CustomerRepository;
import com.example.fitness.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;


//    @Override
//    public CustomerResponse getCustomerById(String customerId) {
//        return null;
//    }

    @Override
    public CustomerResponse saveCustomer(CustomerRequest customerRequest) {

        if (customerRequest == null) {
            //TODO: Maybe we could throw a custom exception
            return null;
        }


        //TODO: Check for uniqueness

        // Map to Customer
        Customer customer = CustomerMapper.map.customerRequestToCustomer(customerRequest);


        // Save To Database
        Customer savedCustomer = customerRepository.save(customer);

        // Map to CustomerResponse
        CustomerResponse customerResponse = CustomerMapper.map.customerToCustomerResponse(savedCustomer);

        // Calculate age
        customerResponse.calculateAge();

        //Return CustomerResponse
        return customerResponse;
    }
}
