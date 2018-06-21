package com.app;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private double empSal;

	private Address addr;

	public Employee() {
		super();
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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Employee(int empId, String empName, double empSal, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.addr = addr;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", addr=" + addr + "]";
	}

}
