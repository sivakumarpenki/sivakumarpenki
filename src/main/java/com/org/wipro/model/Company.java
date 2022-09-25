package com.org.wipro.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data

public class Company {
    @Id
    private int id;
    private String companyName;
    private String companyAddress;
    private double companyContactNumber;
    private String companyMail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public double getCompanyContactNumber() {
        return companyContactNumber;
    }

    public void setCompanyContactNumber(double companyContactNumber) {
        this.companyContactNumber = companyContactNumber;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }
}