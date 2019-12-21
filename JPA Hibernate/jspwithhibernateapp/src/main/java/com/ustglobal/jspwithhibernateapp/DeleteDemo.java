package com.ustglobal.jspwithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernateapp.dto.Product;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		
		try {
			 entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 Product product = entityManager.find(Product.class, 101);
			
			entityManager.remove(product);
			System.out.println("Record Remove");
			entityTransaction.commit();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}

}