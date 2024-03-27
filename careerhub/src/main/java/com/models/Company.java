package com.models;
import java.util.*;

public class Company {
	private int companyId;
	private String companyName;
	private String location;
	
	public Company(int companyId, String companyName, String location) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void postJob(String jobTitle, String jobDescription, String jobLocation, double salary, String jobType) {
		System.out.println("New Job Posted Successfully");
	}
	
	public List<JobListing> getJobs(){
		return new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location + "]";
	}
	
	
}
