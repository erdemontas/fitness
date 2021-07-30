package com.example.fitness.dto;

import com.example.fitness.constants.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    @NotNull(message = "Name can not bu null")
    private String name;

    @NotNull(message = "Surname can not bu null")
    private String surname;

    @NotNull(message = "Email can not be null")
    @Email
    private String email;

    @NotNull(message = "Birth Date can not bu null")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Gender can not bu null")
    private Gender gender;

}
