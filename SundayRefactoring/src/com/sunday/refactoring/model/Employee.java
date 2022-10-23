package com.sunday.refactoring.model;

public abstract class Employee {
	public String employeeID;
	public String fullName;
	public String address;
	public String facultyName;
	public String department;
	public String designation;
	
	public abstract String getEmployeeID();
	public abstract void setEmployeeID(String employeeID);
	public abstract String getFullName();
	public abstract void setFullName(String fullName);
	public abstract String getAddress();
	public abstract void setAddress(String address);
	public abstract String getFacultyName();
	public abstract void setFacultyName(String facultyName);
	public abstract String getDepartment();
	public abstract void setDepartment(String department);
	public abstract String getDesignation();
	public abstract void setDesignation(String designation);
	public abstract String toString();
	
	//template method
	public final void initializeEmployee() {
		setEmployeeID(employeeID);
		setFullName(fullName);
		setAddress(address);
		setFacultyName(facultyName);
		setDepartment(department);
		setDesignation(designation);
	}
}
