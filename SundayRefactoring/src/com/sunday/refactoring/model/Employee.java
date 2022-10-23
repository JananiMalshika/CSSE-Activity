package com.sunday.refactoring.model;

public abstract class Employee {
	public String employeeID;
	public String fullName;
	public String address;
	public String facultyName;
	public String department;
	public String designation;
	
	abstract String getEmployeeID();
	abstract void setEmployeeID(String employeeID);
	abstract String getFullName();
	abstract void setFullName(String fullName);
	abstract String getAddress();
	abstract void setAddress(String address);
	abstract String getFacultyName();
	abstract void setFacultyName(String facultyName);
	abstract String getDepartment();
	abstract void setDepartment(String department);
	abstract String getDesignation();
	abstract void setDesignation(String designation);
	
	//template method
	public final void initializeEmployee() {
		setEmployeeID(employeeID);
		setFullName(fullName);
		setAddress(address);
		setFacultyName(facultyName);
		setDepartment(department);
		setDesignation(designation);
	}
	
	@Override
	public String toString() {
		
		return "Employee ID = " + employeeID + "\n" + "FullName = " + fullName + "\n" + "Address = " + address + "\n"
				+ "Faculty Name = " + facultyName + "\n" + "Department = " + department + "\n" + "Designation = "
				+ designation;
	}
}
