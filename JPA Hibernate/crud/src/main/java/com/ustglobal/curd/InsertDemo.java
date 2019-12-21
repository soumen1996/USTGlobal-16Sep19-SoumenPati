package com.ustglobal.curd;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.curd.dto.Employee_Info;


public class InsertDemo {
	
	public static void main(String[] args) {
		
		Employee_Info employee = new Employee_Info();
		
		employee.setId(170);
		employee.setName("Baishakhi");
		employee.setGender("F");
		employee.setSal(40000);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		
		System.out.println("Record Saved");

	
	entityTransaction.commit();
	entityManager.close();
	
	}//main methods
}