package com.zozoo.hrservice.models;

public class Employee {

	private String Id;
	private String firstName;
	private String lastName;
	private String speciality;

	/*
	 * default constructor
	 */
	Employee() {
	}

	/*
	 * param constructor
	 */
	public Employee(String id, String firstName, String lastName, String speciality) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciality = speciality;
	}

	/*
	 * getters and setters
	 */
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	};

}
