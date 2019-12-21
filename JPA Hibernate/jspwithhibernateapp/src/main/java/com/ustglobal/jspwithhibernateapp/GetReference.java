package com.ustglobal.jspwithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernateapp.dto.Product;

public class GetReference {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerFactory = null;
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
			
			entitymanagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entitymanagerFactory.createEntityManager();
			Product p = entityManager.getReference(Product.class, 102);
			/*Product p = entityManager.find(Product.class, 102);
			System.out.println(p.getClass());
			*/
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getQuantity());
			
			
			
		} catch (Exception e) {
			
		}
		
		
	}
}