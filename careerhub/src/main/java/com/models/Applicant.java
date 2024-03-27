package com.models;

public class Applicant {
	private int applicantId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String resume;
	private int experience;
	private String city;
	private String state;
	
	public Applicant(int applicantId, String firstName, String lastName, String email, String phone, String resume, int experience, String city, String state) {
		this.applicantId = applicantId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.resume = resume;
		this.experience = experience;
		this.city = city;
		this.state = state;
	}	

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void createProfile(String email, String firstName, String lastName, String phone) {
		System.out.println("Profile Created Successfully");
	}
	
	public void ApplyForJob(int jobId, String coverLetter) {
		System.out.println("Job Applied Successfully");
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", resume=" + resume + ", experience=" + experience
				+ ", city=" + city + ", state=" + state + "]";
	}
	
	
}
