package com.ust.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Hello;

public class LifeCycleClass {
	public static void main(String[] args) {
		
		/*because close() is present inside ClassPathXmlApplicationContext not inside  ApplicationContext interface*/
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		/*close() is used to destroy the bean*/
		context.close(); 
	}

}
