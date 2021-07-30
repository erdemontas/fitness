package com.example.fitness.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sport extends BaseEntity{

    @Column(name="name")
    private String name;
//
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "tags")
//    private Set<Customer> posts = new HashSet<>();

}