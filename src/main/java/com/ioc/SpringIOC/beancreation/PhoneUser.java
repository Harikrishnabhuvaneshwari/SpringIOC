package com.ioc.SpringIOC.beancreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneUser {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Phone phone=applicationContext.getBean("phone",Nokia.class);
		phone.call();
	}
}
