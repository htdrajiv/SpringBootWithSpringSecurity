package com.rajiv.practice.springBoot.repository;

import com.rajiv.practice.springBoot.domain.TestDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rajiv on 7/30/2016.
 */
@Repository
public interface TestDomainRepo extends JpaRepository<TestDomain, Long> { /*auto implemented by spring at run time*/  }
