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
		return department;
	}

	@Override
	void setDepartment(String department) {
		this.department = department;
	}

	@Override
	String getDesignation() {
		return designation;
	}

	@Override
	void setDesignation(String designation) {
		this.designation = "Lecturer";
	}

	@Override
	public String toString() {
		return "Employee ID = " + employeeID + "\n" + "FullName = " + fullName + "\n" + "Address = " + address + "\n"
				+ "Faculty Name = " + facultyName + "\n" + "Department = " + department + "\n" + "Designation = "
				+ designation;
	}
}