package com.example.backend_viikko2_student.domain;

public class Friend {
	 private String firstName;
	 private String lastName;
	 
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
	@Override
	public String toString() {
		return "Friend [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Friend(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Friend() {
	
	}
	
	
	 
	 
}
