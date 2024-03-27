package com.dao;
import java.sql.SQLException;
import java.util.*;
import com.models.*;

public interface DataManagerDao {
	List<Applicant> getApplicants() throws ClassNotFoundException, SQLException;
	public void insertApplicant(Applicant applicant) throws ClassNotFoundException, SQLException;
	
	List<Company> getCompany() throws ClassNotFoundException, SQLException;
	public void insertCompany(Company company) throws ClassNotFoundException, SQLException;
	
	List<JobListing> getJobListing() throws ClassNotFoundException, SQLException;
	public void insertJobListing(JobListing jobListing) throws ClassNotFoundException, SQLException;
	
	List<JobApplication> getJobApplication(int id) throws ClassNotFoundException, SQLException;
	public void insertJobApplication(JobApplication jobApplication) throws ClassNotFoundException, SQLException;
}
