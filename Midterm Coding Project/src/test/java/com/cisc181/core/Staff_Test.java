package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	
	private static ArrayList<Staff> staff = new ArrayList<Staff>();
	
	//Set up arrayList
	@Before
	public void setup2() {
		staff.add(new Staff(eTitle.MR)); //Double(200000)
		staff.get(0).setSalary(200000);
		
		staff.add(new Staff(eTitle.MRS));  //Double(60000)
		staff.get(1).setSalary(60000);
		
		staff.add(new Staff(eTitle.MR)); //432000
		staff.get(2).setSalary(432000);
		
		staff.add(new Staff(eTitle.MS)); //530000
		staff.get(3).setSalary(530000);
		
		staff.add(new Staff(eTitle.MRS)); //390000
		staff.get(4).setSalary(390000);
	}
	
	//Average of ArrayList
	@Test
	public void testStaff() {
		double sum = 0;
		for (int i = 0; i < staff.size(); i++) {
			sum += staff.get(i).getSalary();
		}
		double ExpectedResult = 107466.66666666667;
		double ActualResult = sum/staff.size();
		assertEquals(ExpectedResult, ActualResult, 0.01);
	
	}

	//Invalid Phone number throws exception
	@Test (expected = PersonException.class)
	public void testPhoneNumber() throws PersonException {
		Staff test = new Staff(eTitle.MR);
		test.validatePhoneNumber("853-812-33214");
	}
	
	//Invalid DOB throws exception
	@SuppressWarnings("deprecation")
	@Test (expected = PersonException.class)
	public void testDOB() throws PersonException {
	Staff test = new Staff(eTitle.MR);
		test.setDOB(new Date(1, 10, 13));
		test.PrintAge();
	}
		
}
