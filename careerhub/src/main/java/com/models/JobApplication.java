package com.models;

import java.sql.Timestamp;
import java.util.*;

public class JobApplication {
	private int applicationId;
	private int jobId;
	private int applicantId;
	private Timestamp applicationDate;
	private String coverLetter;
	
	public JobApplication(int applicationId, int jobId, int applicantId, Timestamp applicationDate, String coverLetter) {
		this.applicationId = applicationId;
		this.jobId = jobId;
		this.applicantId = applicantId;
		this.applicationDate = applicationDate;
		this.coverLetter = coverLetter;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public Timestamp getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Timestamp applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	@Override
	public String toString() {
		return "JobApplication [applicationId=" + applicationId + ", jobId=" + jobId + ", applicantId=" + applicantId
				+ ", applicationDate=" + applicationDate + ", coverLetter=" + coverLetter + "]";
	}
	
	
}
