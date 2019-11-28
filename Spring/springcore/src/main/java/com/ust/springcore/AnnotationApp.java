package com.ust.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.ust.springcore.config.HelloConfigurationClass;
import com.ust.springcore.di.Animal;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello);
		
		Hello hello1 = context.getBean(Hello.class);
		System.out.println(hello1);
		
		System.out.println("********************");
		
//		Animal animal = context.getBean(Animal.class);
//		animal.makeSound(); it will gave exception while using multiple autowire because for 
//		autowiring there will be two object available,
//		so ambiguity condition
		
		
		System.out.println("********************");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
		}
	
}
