package com.ustglobal.jspwithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateQuery {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			String jpql = "update Product set pname='mobile' where pid = 103";
			 Query query = entityManager.createQuery(jpql);
			 
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