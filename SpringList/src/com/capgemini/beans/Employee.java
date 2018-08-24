package com.capgemini.beans;

import java.util.List;

public class Employee {
	private int empNum;
private String empName;
private List<Address> address;
public int getEmpNum() {
	return empNum;
}
public void setEmpNum(int empNum) {
	this.empNum = empNum;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}


}
