package com.ustglobal.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.curd.dto.Employee_Info;

public class ReadDemo {
	
public static void main(String[] args) {
	
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee_Info employee_Info = entityManager.find(Employee_Info.class, 170);
		
		System.out.println("ID--> "+employee_Info.getId());
		System.out.println("Name--> "+employee_Info.getName());
		System.out.println("Gender----> "+employee_Info.getGender());
		System.out.println("Gender----> "+employee_Info.getSal());
		
		
	
	}//main methods

}
