package com.ustglobal.jspwithhibernateapp.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToMany {
	
	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCid(40);
		course.setCname("Hibernate");
		
		Course course1 = new Course();
		course1.setCid(50);
		course1.setCname("Spring");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course);
		alCourses.add(course1);
		
		
		Student student = new Student();
		
		student.setSid(2);
		student.setSname("Chandan");
		
		student.setCourse(alCourses);
		
		
		
		EntityManager entityManager = null;
		
		EntityTransaction entityTransaction = null;
		
		
		
		try {
			
			
			
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				
				entityManager = entityManagerFactory.createEntityManager();
				
				
				entityTransaction = entityManager.getTransaction();
				
				entityTransaction.begin();
				
				System.out.println("Record Saved");
				
				entityManager.persist(student);
			
			entityTransaction.commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		entityManager.close();
	}
}