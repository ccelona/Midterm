package com.cisc181.core;

public class PersonException extends Exception {
	
	public Person person;
	
	public PersonException(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}
	
	public PersonException(String Person) {
		super(Person);
	}

	public PersonException() {
		super();
	}
	
	
}
