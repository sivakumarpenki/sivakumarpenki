package com.org.wipro.controller;

import com.org.wipro.model.Company;
import com.org.wipro.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class CompanyController {

    @Autowired
    CompanyService companyService;
    @PostMapping("/create")
    public void buildCompany(@RequestBody Company company){
        companyService.buildCompany(company);
    }



}
