package com.ioc.SpringIOC.injectingobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Student student=applicationContext.getBean("student",Student.class);
		student.cheatAction();

		AnotherStudent anotherStudent=applicationContext.getBean("anotherStudent",AnotherStudent.class);
		anotherStudent.cheatAction();
	}

}
