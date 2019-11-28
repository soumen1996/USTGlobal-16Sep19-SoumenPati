package com.ust.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class XmlComponentScanApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("How Are You");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Kirti");
		
		System.out.println(pet.getName());
		
		pet.getAnimal().makeSound();
	}
}
