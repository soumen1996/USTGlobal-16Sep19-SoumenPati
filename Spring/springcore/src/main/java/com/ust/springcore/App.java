package com.ust.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Animal;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
    	/*With the help of spring we are getting the object*/
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     
    	Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getMsg());
        
        Hello hello2 = context.getBean(Hello.class);
        
        System.out.println(hello);
        System.out.println(hello2);
       
        
        
        System.out.println(hello.getMap());
        
        Animal animal = context.getBean(Animal.class);
        animal.makeSound();
        
        Animal animal2 = (Animal)context.getBean("dog");
        animal2.makeSound();
        
        Pet pet = context.getBean(Pet.class);
        System.out.println(pet.getName());
        pet.getAnimal().makeSound();
    }
}
