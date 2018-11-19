package com.licerlee.java8.lambda;

public class Person {
	String firstName;
	String lastName;

	Person() {
	}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person: " + firstName + " ," + lastName;
	}
}
