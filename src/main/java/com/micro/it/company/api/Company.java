package com.micro.it.company.api;

import java.util.List;

import lombok.Data;

public @Data class Company {
	private String companyId;
	private String companyName;
	private List<Team> teams;

	public Company(String companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
	}

}
