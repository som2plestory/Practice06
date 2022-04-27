package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	private String department;

	public Depart() {
		super();
	}

	public Depart(String name, int Salary, String department) {
		super(name, Salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	public void showInformation() {
		super.showInformation();
		System.out.println("부서:"+department);
	}
	

}
