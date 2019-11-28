package com.ust.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ust.springcore.di.Cat;
import com.ust.springcore.di.Dog;
import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;


@Import(PetConfiguration.class)
@Configuration
public class HelloConfigurationClass {
	
	@Bean(name = "hello")
	
	
//	@Scope("prototype")//ByDefault Singleton Class so he use prototype
	
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love Python");
		return hello;
	}
	
	/*@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
//		pet.setAnimal(getDog());[It's not needed in Autowire]
		return pet;
	}*/

}
