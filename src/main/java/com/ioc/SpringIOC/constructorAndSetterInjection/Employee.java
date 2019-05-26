package com.ioc.SpringIOC.constructorAndSetterInjection;


public class Employee {
	private int employeeId;
	private String employeeName;

	private Employee(){
		// eventhough the constructor is private still we can create bean for this class 
		//using this constructor.
	}

	public Employee(int employeeId,String employeeName){
		System.out.println("checking constructor injection");
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}


	public void setEmployeeId(int employeeId) {
		System.out.println("Setter injection check");
		this.employeeId = employeeId;
	}


	public void setEmployeeName(String employeeName) {
		System.out.println("Setter injection check");
		this.employeeName = employeeName;
	}


	public void employeeDetails(){
		System.out.println("Employee Id : "+employeeId+" Employee Name : "+employeeName);
	}
}
