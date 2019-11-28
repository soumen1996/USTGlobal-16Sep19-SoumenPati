package com.ustglobal.jspwithhibernateapp;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernateapp.dto.Product;

public class InsertDemo {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPid(103);
		product.setPname("Paper");
		product.setQuantity(20);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(product);
		
		System.out.println("Record Saved");

	
	entityTransaction.commit();
	entityManager.close();
	
	}//main methods
}
