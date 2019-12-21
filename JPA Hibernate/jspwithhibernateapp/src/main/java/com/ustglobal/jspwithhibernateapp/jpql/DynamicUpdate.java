package com.ustglobal.jspwithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class DynamicUpdate {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			String jpql = "update Product set pname=:name where pid=:id";
			 Query query = entityManager.createQuery(jpql);
			 
			 query.setParameter("name", "book");
			 query.setParameter("id", 102);
			 
			 int result = query.executeUpdate();
			 
			 System.out.println(result);
			 
			 transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		 finally {
			 entityManager.close();
		}

	}

}