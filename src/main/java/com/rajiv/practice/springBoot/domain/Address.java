package com.rajiv.practice.springBoot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Rajiv on 7/31/2016.
 */
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String streetFirst;

    private String streetSecond;

    @NotNull
    private String state;

    @NotNull
    private String city;

    @NotNull
    private String zip;

    @NotNull
    private String mobile;

    private String phone;

}
