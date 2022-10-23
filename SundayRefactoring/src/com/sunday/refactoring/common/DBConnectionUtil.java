package com.sunday.refactoring.common;


import org.xml.sax.SAXException;

import com.sunday.refactoring.model.Employee;

import java.sql.Connection;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.xml.parsers.ParserConfigurationException;
import java.sql.PreparedStatement;
import javax.xml.xpath.XPathExpressionException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.Statement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DBConnectionUtil extends ReadProperty {

	private final ArrayList<Employee> emp = new ArrayList<Employee>();

	private static Connection connect;

	private static Statement statement;

	private PreparedStatement preparedStatement;

	public DBConnectionUtil() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"),
					p.getProperty("password"));
		} catch (Exception e) {
		} 
	}

	public void a2() {

		try {
			int Size = XSLTransformUtil.XMLXPATHS().size();
			for (int i = 0; i < Size; i++) {
				Map<String, String> employeeOutputMap = XSLTransformUtil.XMLXPATHS().get(i);
				final ArrayList<Employee> employee = new ArrayList<Employee>();
				employee.setEmployeeID(employeeOutputMap.get("XpathEmployeeIDKey"));
				employee.setFullName(employeeOutputMap.get("XpathEmployeeNameKey"));
				employee.setAddress(employeeOutputMap.get("XpathEmployeeAddressKey"));
				employee.setFacultyName(employeeOutputMap.get("XpathFacultyNameKey"));
				employee.setDepartment(employeeOutputMapget("XpathDepartmentKey"));
				employee.setDesignation(employeeOutputMap.get("XpathDesignationKey"));
				empl.add(Employee);
				System.out.println(employee.toString() + "\n");
			}
		} catch (Exception e) {
		}
	}

	public void a3() {
		try {
			statement = connect.createStatement();
			statement.executeUpdate(RequestUtil.Q("q2"));
			statement.executeUpdate(RequestUtil.Q("q1"));
		} catch (Exception e) {
		}
	}

	public void a4() {
		try {
			preparedStatement = connect.prepareStatement(RequestUtil.Q("q3"));
			connect.setAutoCommit(false);
			for(int i = 0; i < el.size(); i++){
				Employee emp = el.get(i);
				preparedStatement.setString(1, e.EMPLOYEEiDgET());
				preparedStatement.setString(2, e.fULLnAMEgET());
				preparedStatement.setString(3, e.aDDRESSgET());
				preparedStatement.setString(4, e.fACULTYnAMEgET());
				preparedStatement.setString(5, e.dEPARTMENTgET());
				preparedStatement.setString(6, e.dESIGNATIONgET());
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			connect.commit();
		} catch (Exception e) {
		}
	}

	public void getEmployeeByID(String eid) {

		Employee employee = new Employee();
		
		try {
			preparedStatement = connect.prepareStatement(RequestUtil.Q("q4"));
			preparedStatement.setString(1, eid);
			ResultSet R = preparedStatement.executeQuery();
			while (R.next()) {
				e.eMPLOYEEiD(R.getString(1));
				e.fULLnAME(R.getString(2));
				e.aDDRESS(R.getString(3));
				e.fACULTYNAME(R.getString(4));
				e.dEPARTMENT(R.getString(5));
				e.dESIGNATION(R.getString(6));
			}
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
			employeeList.add(employee);
			eMPLOYEEoUTPUT(employeeList);
		} catch (Exception ex) {
		}
	}

	public void EMPLOYEEDELETE(String eid) {

		try {
			preparedStatement = connect.prepareStatement(RequestUtil.Q("q6"));
			preparedStatement.setString(1, eid);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void a5() {

		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		try {
			preparedStatement = connect.prepareStatement(RequestUtil.Q("q5"));
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				Employee employee = new Employee();
				employee.setEmployeeID(r.getString(1));
				employee.setFullName(r.getString(2));
				employee.setAddress(r.getString(3));
				employee.setFacultyName(r.getString(4));
				employee.setDepartment(r.getString(5));
				employee.setDesignation(r.getString(6));
				listEmp.add(employee);
			}
		} catch (Exception e) {
		}
		employeeInfo(listEmp);
	}
	
	public void employeeInfo(ArrayList<Employee> listEmp){
		
		System.out.println("Employee ID" + "\t\t" + "Full Name" + "\t\t" + "Address" + "\t\t" + "Faculty Name" + "\t\t"
				+ "Department" + "\t\t" + "Designation" + "\n");
		System.out
				.println("================================================================================================================");
		for(int i = 0; i < listEmp.size(); i++){
			Employee e = listEmp.get(i);
			System.out.println(e.getEmployeeID() + "\t" + e.getFullName() + "\t\t"
					+ e.getAddress() + "\t" + e.getFacultyName() + "\t" + e.getDepartment() + "\t"
					+ e.getDesignation() + "\n");
			System.out
			.println("----------------------------------------------------------------------------------------------------------------");
		}
		
	}
}
