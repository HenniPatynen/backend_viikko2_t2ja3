package com.example.backend_viikko2_student.domain;

public class Student {
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
public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
}
 
 
}
