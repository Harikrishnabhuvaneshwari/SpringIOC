package com.ioc.SpringIOC.constructorAndSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=applicationContext.getBean("employee",Employee.class);
		employee.employeeDetails();
		Employee oldEmployee=applicationContext.getBean("oldEmployee",Employee.class);
		oldEmployee.employeeDetails();
	}

}
