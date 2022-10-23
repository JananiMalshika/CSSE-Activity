package com.sunday.refactoring.model;

public class Lecturer extends Employee{
	public String employeeID;
	public String fullName;
	public String address;
	public String facultyName;
	public String department;
	public String designation;
	
	@Override
	String getEmployeeID() {
		return employeeID;
	}

	@Override
	void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
		
	}

	@Override
	String getFullName() {
		return fullName;
	}

	@Override
	void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	String getAddress() {
		return address;
	}

	@Override
	void setAddress(String address) {
		this.address = address;
	}

	@Override
	String getFacultyName() {
		return facultyName;
	}

	@Override
	void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setDepartment(String department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getDesignation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setDesignation(String designation) {
		// TODO Auto-generated method stub
		
	}

}
