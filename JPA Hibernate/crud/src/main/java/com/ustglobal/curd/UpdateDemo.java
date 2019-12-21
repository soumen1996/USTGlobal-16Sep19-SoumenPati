package com.ustglobal.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.curd.dto.Employee_Info;


public class UpdateDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		
		try {
			 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 Employee_Info employee = entityManager.find(Employee_Info.class, 170);
			
			employee.setName("Sanchita");
			System.out.println("Updated Record");
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		


}
}