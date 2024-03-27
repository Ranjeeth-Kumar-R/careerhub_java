package com.models;

import java.time.LocalDateTime;
import java.util.*;

import java.sql.Timestamp;

public class JobListing {
	private int jobId;
	private int companyId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private double salary;
	private String jobType;
	private Timestamp postedDate;
	
	public JobListing(int jobId, int companyId, String jobTitle, String jobDescription, String jobLocation,
			double salary, String jobType, Timestamp postedDate) {
		this.jobId = jobId;
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobType = jobType;
		this.postedDate = postedDate;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Timestamp getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}
	
	public void apply(int applicantId, String CoverLetter) {
		System.out.println("Application Submitted Successfully");
	}
	
	public List<Applicant> getApplicants(){
		return new ArrayList<>();
	}

	@Override
	public String toString() {
		return "JobListing [jobId=" + jobId + ", companyId=" + companyId + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", salary=" + salary
				+ ", jobType=" + jobType + ", postedDate=" + postedDate + "]";
	}
	
	
}
