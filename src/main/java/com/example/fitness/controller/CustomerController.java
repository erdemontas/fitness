package com.example.fitness.controller;


import com.example.fitness.dto.CustomerRequest;
import com.example.fitness.dto.CustomerResponse;
import com.example.fitness.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

//    @GetMapping("/all-customers")
//    public ResponseEntity<CustomerResponse> getAllCustomers(){
//
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable String customerId){
//        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
//    }


    @PostMapping
    public ResponseEntity<CustomerResponse> saveCustomer(@Valid @RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<>(customerService.saveCustomer(customerRequest), HttpStatus.OK);

    }
//
//    @PutMapping
//    public ResponseEntity<CustomerResponse> updateCustomer(){
//
//    }

}
