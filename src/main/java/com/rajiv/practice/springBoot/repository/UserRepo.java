package com.rajiv.practice.springBoot.repository;

import com.rajiv.practice.springBoot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rajiv on 7/31/2016.
 */
@Repository
public interface UserRepo extends JpaRepository<User,Long>{ /*auto implemented by spring at run time*/ }
