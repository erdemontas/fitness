package com.example.fitness.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;


@NoArgsConstructor
@Entity
public class Subscription extends BaseEntity {
    private String type;
    private boolean is_active;
    private Date start_date;
}