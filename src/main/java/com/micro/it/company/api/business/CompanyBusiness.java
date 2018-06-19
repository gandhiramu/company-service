package com.micro.it.company.api.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.it.company.api.Company;

@Service
public class CompanyBusiness {
	private List<Company> companyList = new ArrayList<>();

	// TODO will be replaced by Apache Cassandra
	public List<Company> getCompanies() {
		companyList.add(new Company("1", "Google"));
		companyList.add(new Company("2", "Facebook"));
		return companyList;
	}

	public Company getCompany(String id) {

		return companyList.stream()
						.filter(company -> company.getCompanyId().equals(id))
						.findFirst()
						.orElse(null);
	}
}
