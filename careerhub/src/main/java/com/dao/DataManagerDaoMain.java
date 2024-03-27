package com.dao;
import com.utils.*;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.List;
import java.util.ArrayList;

import com.models.Applicant;
import com.models.Company;
import com.models.JobApplication;
import com.models.JobListing;

public class DataManagerDaoMain implements DataManagerDao{

	@Override
	public List<Applicant> getApplicants() throws ClassNotFoundException, SQLException {
		List<Applicant> applicants=new ArrayList<>();
		
		Connection con = DBConnection.getConnection();
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("Select * from Applicants");
			while(rs.next()) {
				Applicant a=new Applicant(
						rs.getInt("ApplicantID"),
						rs.getString("FirstName"),
						rs.getString("LastName"),
						rs.getString("Email"),
						rs.getString("Phone"),
						rs.getString("Resume"),
						rs.getInt("Experience"),
						rs.getString("city"),
						rs.getString("state")
				);
				applicants.add(a);
				
			}
			return applicants;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<>(null);
	}

	@Override
	public void insertApplicant(Applicant applicant) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement st= con.prepareStatement("Insert into Applicants values(?,?,?,?,?,?,?,?,?)");
			st.setInt(1, applicant.getApplicantId());
			st.setString(2, applicant.getFirstName());
			st.setString(3, applicant.getLastName());
			st.setString(4, applicant.getEmail());
			st.setString(5, applicant.getPhone());
			st.setString(6, applicant.getResume());
			st.setInt(7, applicant.getExperience());
			st.setString(8, applicant.getCity());
			st.setString(9, applicant.getState());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Company> getCompany() throws ClassNotFoundException, SQLException {
		List<Company> company=new ArrayList<>();
		Connection con = DBConnection.getConnection();
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("Select * from Companies");
			while(rs.next()) {
				Company c=new Company(
						rs.getInt("CompanyID"),
						rs.getString("CompanyName"),
						rs.getString("Location")		
				);
				company.add(c);
			}
			return company;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<>(null);
	}

	@Override
	public void insertCompany(Company company) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement st= con.prepareStatement("Insert into Companies values(?,?,?)");
			st.setInt(1, company.getCompanyId());
			st.setString(2, company.getCompanyName());
			st.setString(3, company.getLocation());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<JobListing> getJobListing() throws ClassNotFoundException, SQLException {
		List<JobListing> joblisting=new ArrayList<>();
		Connection con = DBConnection.getConnection();
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("Select * from jobs");
			while(rs.next()) {
				JobListing jl=new JobListing(
					rs.getInt("JobID"),
					rs.getInt("CompanyID"),
					rs.getString("JobTitle"),
					rs.getString("JobDescription"),
					rs.getString("JobLocation"),
					rs.getDouble("Salary"),
					rs.getString("JobType"),
					rs.getTimestamp("PostedDate")	
				);
				joblisting.add(jl);
			}
			return joblisting;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<>(null);
	}

	@Override
	public void insertJobListing(JobListing jobListing) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement st= con.prepareStatement("Insert into jobs values(?,?,?,?,?,?,?,?)");
			st.setInt(1, jobListing.getJobId());
			st.setInt(2, jobListing.getCompanyId());
			st.setString(3, jobListing.getJobTitle());
			st.setString(4, jobListing.getJobDescription());
			st.setString(5, jobListing.getJobLocation());
			st.setDouble(6, jobListing.getSalary());
			st.setString(7, jobListing.getJobType());
			st.setTimestamp(8, jobListing.getPostedDate());
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public List<JobApplication> getJobApplication(int id) throws ClassNotFoundException, SQLException {
		List<JobApplication> jobApplication=new ArrayList<>();
		Connection con = DBConnection.getConnection();
		try {
			Statement st= con.createStatement();
			String sta="Select * from Applications"+String.valueOf(id);
			ResultSet rs=st.executeQuery(sta);
			while(rs.next()) {
				JobApplication ja=new JobApplication(
					rs.getInt("ApplicationID"),
					rs.getInt("JobID"),
					rs.getInt("ApplicantID"),
					rs.getTimestamp("ApplicationDate"),
					rs.getString("CoverLetter")
				);
				jobApplication.add(ja);
			}
			return jobApplication;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<>(null);
	}

	@Override
	public void insertJobApplication(JobApplication jobApplication) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement st= con.prepareStatement("Insert into Applications values(?,?,?,?,?)");
			st.setInt(1, jobApplication.getApplicationId());
			st.setInt(2, jobApplication.getJobId());
			st.setInt(3, jobApplication.getApplicantId());
			st.setTimestamp(4, jobApplication.getApplicationDate());
			st.setString(5, jobApplication.getCoverLetter());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
