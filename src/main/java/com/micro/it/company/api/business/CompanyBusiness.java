package com.micro.it.company.api.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.it.company.api.Company;

@Service
public class CompanyBusiness {
	private List<Company> companys = new ArrayList<>();

	public List<Company> getCompanys() {
		companys.add(new Company("1", "Google"));
		companys.add(new Company("2", "Facebook"));
		return companys;
	}

}
