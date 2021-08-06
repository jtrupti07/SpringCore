package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/cycleconfig.xml");
        /*Cycle c1=(Cycle) context.getBean("c1");
        System.out.println(c1);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        Vespa v1=(Vespa)context.getBean("v1");
        System.out.println(v1);
        */
		
		Subject s1=(Subject)context.getBean("s1");
		System.out.println(s1);
        
        
        
        //registering shutdown hook...
        context.registerShutdownHook();
	}

}
