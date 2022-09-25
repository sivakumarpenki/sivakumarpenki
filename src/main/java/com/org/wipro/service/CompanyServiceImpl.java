package com.org.wipro.service;

import com.org.wipro.model.Company;
import com.org.wipro.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;
    @Override
    public void buildCompany(Company company) {
        companyRepository.save(company);
    }
}
