package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.*;
import java.util.UUID;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	private static ArrayList<Course> courses = new ArrayList<Course>();

	// Set up ArrayList for Course
	@Before
	public void setup2() {
		courses.add(new Course());
		courses.add(new Course());
		courses.add(new Course());

	}

	private static ArrayList<Semester> semesters = new ArrayList<Semester>();

	// Set up ArrayList for Semester
	@Before
	public void setup3() {
		semesters.add(new Semester()); // Fall
		semesters.add(new Semester()); // Spring

	}

	private static ArrayList<Section> sections = new ArrayList<Section>();

	// Set up ArrayList for Section
	@Before
	public void setup4() {
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID()));
	}

	private static ArrayList<Student> students = new ArrayList<Student>();

	// Set up ArrayList for Student
	@Before
	// Date.valueOf("")
	public void setup5() {
		// Student 1
		students.add(new Student("John", "Jacob", "Smith", new Date(96, 10, 30), eMajor.CHEM, "5 Surrey Lane",
				"8566303214", "jsmith@udel.edu"));
		// Student 2
		students.add(new Student("Abby", "Rose", "Johnson", new Date(94, 04, 10), eMajor.PHYSICS, "8222 9th Street",
				"2025550178", "ajohnson@udel.edu"));
		// Student 3
		students.add(new Student("James", "Peter", "Williams", new Date(95, 05, 15), eMajor.PHYSICS,
				"8588 Ridge Street", "3446851093", "jwilliams@udel.edu"));
		// Student 4
		students.add(new Student("Michael", "Anthony", "Brown", new Date(93, 11, 11), eMajor.NURSING,
				"6130 Center Street", "1895374664", "mbrown@udel.edu"));
		// Student 5
		students.add(new Student("Sophia", "Grace", "Jones", new Date(93, 04, 20), eMajor.CHEM, "1387 Highland Drive",
				"3847720099", "sjones@udel.edu"));
		// Student 6
		students.add(new Student("Olivia", "Leigh", "Baker", new Date(96, 06, 27), eMajor.COMPSI, "3700 6th Street",
				"3772916455", "obaker@udel.edu"));
		// Student 7
		students.add(new Student("Joseph", "David", "White", new Date(97, 02, 06), eMajor.COMPSI, "39 Lilac Lane",
				"3382013744", "jwhite@udel.edu"));
		// Student 8
		students.add(new Student("Ryan", "Andrew", "Miller", new Date(94, 12, 15), eMajor.BUSINESS, "157 Church Street",
				"2291038744", "rmiller@udel.edu"));
		// Student 9
		students.add(new Student("Madison", "Ava", "Thompson", new Date(94, 03, 14), eMajor.NURSING,
				"700 Hartford Road", "2283740922", "mthompson@udel.edu"));
		// Student 10
		students.add(new Student("Daniel", "Matthew", "Young", new Date(92, 11, 20), eMajor.BUSINESS,
				"13 Arlington Avenue", "3362874634", "dyoung@udel.edu"));
	}

	// Enroll the 10 students above
	public ArrayList<Enrollment> EnrollStudents() {
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < sections.size(); j++) {
				Enrollment test = new Enrollment(students.get(i).getStudentID(), sections.get(j).getSectionID());
				test.setGrade(95.0);
				enrollments.add(test);
			}
		}
		// enrollments.get(0).setGrade(95.0);
		return enrollments;
	}

	// Calculate Students' GPA
	@Test
	public void CalculateGPA() {
		double sum = 0;
		ArrayList<Enrollment> enrollments = EnrollStudents();
		// Student 1
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(0).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}

		}
		assertEquals(95.0, sum / sections.size(), 0.01);

		// Student 2
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(1).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / sections.size(), 0.01);

		// Student 3
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(2).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 4
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(3).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 5
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(4).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 6
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(5).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 7
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(6).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 8
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(7).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 9
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(8).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		// Student 10
		sum = 0;
		for (int j = 0; j < enrollments.size(); j++) {
			if (students.get(9).getStudentID().equals(enrollments.get(j).getStudentID())) {
				sum += enrollments.get(j).getGrade();
			}
		}

	}

	// Courses Average Grade
	@Test
	public void CoursesAverageGrade() {
		double sum = 0;
		ArrayList<Enrollment> enrollments = EnrollStudents();
		// Student 1
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(0).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 2
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(1).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 3
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(2).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 4
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(3).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 5
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(4).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 6
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(5).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 7
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(6).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 8
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(7).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 9
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(8).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
		// Student 10
		for (int j = 0; j < enrollments.size(); j++) {
			if (sections.get(9).getSectionID().equals(enrollments.get(j).getSectionID())) {
				sum += enrollments.get(j).getGrade();
			}
		}
		assertEquals(95.0, sum / students.size(), 0.01);
	}

	// Change Major
	@Test
	public void ChangeMajor() {
		students.get(0).setMajor(eMajor.PHYSICS);
	}


}