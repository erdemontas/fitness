package com.example.fitness.resources;

import com.example.fitness.constants.Gender;
import com.example.fitness.dto.CustomerRequest;

import java.util.Date;

public class CustomerResource {

    public static CustomerRequest customerRequest = CustomerRequest.builder()
            .name("Erdem")
            .surname("Ontas")
            .gender(Gender.MALE)
            .birthDate(new Date(1994,06,24))
            .build();
}
