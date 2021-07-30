//package com.example.fitness.service.impl;
//
//import com.example.fitness.dto.CustomerRequest;
//import com.example.fitness.dto.CustomerResponse;
//import com.example.fitness.repository.CustomerRepository;
//import com.example.fitness.resources.CustomerResource;
//import com.example.fitness.service.CustomerService;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@RestClientTest(CustomerService.class)
//@RunWith(MockitoJUnitRunner.class)
//class CustomerServiceImplTest {
//
//    @Mock
//    private CustomerRepository customerRepository;
//
//    @InjectMocks
//    private CustomerServiceImpl customerService;
//
//    CustomerRequest savedCustomer;
//
//    @Before
//    public void init(){
//        CustomerRequest savedCustomer = CustomerResource.customerRequest;
//        when(customerRepository.save(any())).thenReturn(savedCustomer);
//    }
//
//    @Test
//    void saveCustomer_withAllProperties() {
//
//        CustomerResponse customerResponse = customerService.saveCustomer(CustomerResource.customerRequest);
//        assertEquals("Erdem", customerResponse.getName());
//    }
//}