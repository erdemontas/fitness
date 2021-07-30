package com.example.fitness.entity;

import com.example.fitness.constants.Gender;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Customer extends BaseEntity {



    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Email
    @Column(name="email")
    private String email;

    @Column(name = "birth_date")
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "register_date")
    private Date registerDate = new Date();
}