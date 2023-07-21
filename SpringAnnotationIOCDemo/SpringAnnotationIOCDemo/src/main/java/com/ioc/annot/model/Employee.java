package com.ioc.annot.model;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private List<Address> empAdd;
	
	public Employee(int empId, String empName, int empAge, List<Address> empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empAdd = empAdd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public List<Address> getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(List<Address> empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empAdd=" + empAdd + "]";
	}
}
