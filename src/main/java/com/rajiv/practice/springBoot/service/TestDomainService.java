package com.rajiv.practice.springBoot.service;

import com.rajiv.practice.springBoot.domain.TestDomain;
import com.rajiv.practice.springBoot.repository.TestDomainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rajiv on 7/31/2016.
 */
@Service
public class TestDomainService {
    @Autowired
    TestDomainRepo testDomain;
    public List<TestDomain> getData(){
        return testDomain.findAll();
    }
}
