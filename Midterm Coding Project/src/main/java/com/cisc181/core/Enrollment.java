package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	//No-arg constructor
	private Enrollment() {
	
	}

	//Two-arg constructor
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
	}

	//Procedure
	public void SetGrade(double grade) {
		
	}

	//Getters and Setters
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	public double GPA(double grade) {
		if (grade >= 95) return 4.0;
		else if (grade >= 90) return 3.5;
		else if (grade >= 85) return 3.33;
		else if (grade >= 80) return 3.0;
		else if (grade >= 75) return 2.5;
		else if (grade >= 70) return 2.0;
		else if (grade >= 65) return 1.5;
		else if (grade >= 60) return 1.0;
		return 0.0;
	}
	
	
}
