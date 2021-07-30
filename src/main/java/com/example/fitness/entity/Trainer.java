package com.example.fitness.entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trainer extends BaseEntity{


    private String name;

    private String gender;

    @OneToOne
    private Sport profession;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;
}