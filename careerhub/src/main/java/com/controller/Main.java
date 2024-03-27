package com.controller;
import com.exceptions.*;
import com.models.*;
import com.utils.*;
import com.dao.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Welcome to CareerHub !!\nFeatures:");
			System.out.println("1. Job Listing Retrieval");
			System.out.println("2. Applicant Profile Creation");
			System.out.println("3. Job Application Submission");
			System.out.println("4. Company Job Posting");
			System.out.println("5. Salary Range Query");
			System.out.println("6. Exit");
			System.out.print("Enter your Choice: ");
			choice=scan.nextInt();
			
			switch(choice) {
				case 1:
				{
					DataManagerDaoMain dm=new DataManagerDaoMain();
					try{
						List<JobListing> jl=dm.getJobListing();
						for(JobListing j:jl) {
							System.out.println(jl.toString()+"\n");
						}
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}
				case 2:
				{
					DataManagerDaoMain dm=new DataManagerDaoMain();
					try{
						Applicant a=new Applicant(11,"Ranjeeth","Kumar","ran@gmail.com","90929202039","https://resume.com",3,"Chennai","TamilNadu");
						dm.insertApplicant(a);
						System.out.println("Insertion Successfull");
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}
				case 3:
				{
					DataManagerDaoMain dm=new DataManagerDaoMain();
					try{
						JobApplication ja=new JobApplication(5,6,7, new Timestamp("2024-03-27"),"https://coverletter.com");
						dm.insertJobApplication(ja);
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}
				case 4:
				{
					DataManagerDaoMain dm=new DataManagerDaoMain();
					try{
						
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}
				case 5:
				{
					DataManagerDaoMain dm=new DataManagerDaoMain();
					try{
						
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}
				default:
				{
					System.out.println("Enter correct choice");
					break;
				}
			}
		}
		while(choice!=6);
		
	}
}
