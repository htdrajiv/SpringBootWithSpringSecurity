package com.rajiv.practice.springBoot.domain;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * Created by Rajiv on 7/30/2016.
 */
@Entity
@Table(name = "Test_Table")
public class TestDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String testField1;

    @Column(length = 30)
    private String testField2;

    public String getTestField1() {
        return testField1;
    }

    public void setTestField1(String testField1) {
        this.testField1 = testField1;
    }

    public String getTestField2() {
        return testField2;
    }

    public void setTestField2(String testField2) {
        this.testField2 = testField2;
    }

}
