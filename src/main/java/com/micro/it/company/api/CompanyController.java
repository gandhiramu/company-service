package com.micro.it.company.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.it.company.api.business.CompanyBusiness;

@RestController
public class CompanyController {

	@Autowired
	private CompanyBusiness companyBusiness;

	@RequestMapping("/companies")
	public List<Company> getCompanys() {
		return companyBusiness.getCompanies();
	}
	
	@RequestMapping("/company/{id}")
	public Company getCompany(@PathVariable String id) {
		return companyBusiness.getCompany(id);
	}

}
