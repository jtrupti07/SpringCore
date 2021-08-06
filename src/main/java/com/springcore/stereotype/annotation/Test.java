package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereoconfig.xml");
        Student s1=context.getBean("obj",Student.class);
        System.out.println(s1);
        System.out.println(s1.getAddress().getClass().getName());
	}

}
