package com.org.wipro.service;

import com.org.wipro.model.Company;
import org.springframework.web.bind.annotation.RequestBody;

public interface CompanyService {

    public void buildCompany(Company company);
}
