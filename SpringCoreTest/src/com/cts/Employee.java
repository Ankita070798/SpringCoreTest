package com.cts;

public class Employee {
private String empId;
private String empName;
private String empAddress;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public void getDetails(){
	System.out.println("*****using property*****");
	System.out.println("employee Id="+empId);
	System.out.println("employee Name="+empName);
	System.out.println("employee Address="+empAddress);
	
}
}
