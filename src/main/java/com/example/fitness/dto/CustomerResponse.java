package com.example.fitness.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    private String id;
    private String name;
    private String surname;
    private String gender;
    private Date birthDate;
    private Integer age;
    //private Date registerDate;



    public void calculateAge(){
        LocalDate now = LocalDate.now();
        LocalDate localDateBirthDate = convertDateToLocalDate(getBirthDate());
        Period diff = Period.between(localDateBirthDate, now);
        setAge(diff.getYears());

    }

    public LocalDate convertDateToLocalDate(Date birthDate){
        Instant instant = birthDate.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        return zdt.toLocalDate();
    }
}
