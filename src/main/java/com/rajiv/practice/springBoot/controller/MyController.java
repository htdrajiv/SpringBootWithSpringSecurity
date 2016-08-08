package com.rajiv.practice.springBoot.controller;

import com.rajiv.practice.springBoot.domain.TestDomain;
import com.rajiv.practice.springBoot.service.TestDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rajiv on 7/30/2016.
 */
@Controller
public class MyController {
    @Autowired
    TestDomainService testDomainService;

    @RequestMapping(value = "/test")
    public String login(Model model){
        Map<String,Object> params = new HashMap<>();
        List<TestDomain> testDomainList = testDomainService.getData();
        params.put("p1","hello");
        params.put("p2","world");
        params.put("testObject",testDomainList);
        model.addAttribute("params", params);
        return "test";
    }
}
