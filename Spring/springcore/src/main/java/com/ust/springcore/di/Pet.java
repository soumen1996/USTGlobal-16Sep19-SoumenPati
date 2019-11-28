package com.ust.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pet")
public class Pet {
	
	private String name;
	
	//it will help to qualify this particular name.Cat will be qualified and respective object will be created
		/*It'll called by byName,and object will be created because cat has the id as animal*/
	
	@Autowired
	@Qualifier("cat") 	
	private Animal animal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	/*public Pet() {
		
	}
	
	public Pet(String name, Animal animal) {

		this.name = name;
		this.animal = animal;
	}
	
*/	

}
