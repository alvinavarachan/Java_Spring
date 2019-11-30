package com.face.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext ("resources/Hello.xml");
		HelloWorld myBean = (HelloWorld) beanFactory.getBean ("SpringWithJava");
		myBean.printHello();
		
	}

}
