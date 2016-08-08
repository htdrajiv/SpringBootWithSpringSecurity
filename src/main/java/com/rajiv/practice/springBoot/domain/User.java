package com.rajiv.practice.springBoot.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Rajiv on 7/31/2016.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String fname;

    @NotNull
    private String lname;

    @NotNull
    private String dob;

    @NotNull
    private String gender;

    @NotNull
    @OneToOne
    private Address address;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return calculateAge();
    }

    private int calculateAge(){
        String[] bday = dob.split("/");
        LocalDate birthday = LocalDate.of(Integer.parseInt(bday[2]),Integer.parseInt(bday[0]),Integer.parseInt(bday[1]));
        return (int)birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }

}
