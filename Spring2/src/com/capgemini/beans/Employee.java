package com.capgemini.beans;

public class Employee {
	private int empNum;
private String empName;


/*public Employee() {
	System.out.println("results");
}*/


public int getEmpNum() {
	return empNum;
}
public Employee(int empNum) {
	super();
	this.empNum = empNum;
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


}
