package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		// something
		
		//create session
		//
		
		Session session = factory.getCurrentSession();
		
		try{
			//use the session object to save Java object
			
			// Create a student Object
			System.out.println("Create new student object...");
			Student tempStudent = new Student("Paul","Wall","paul@luv2code.com");
			
			//Start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Savings the student...");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done...");
			
		}finally{
			
			factory.close();
			//ToDO : Some Text
            //some more
			// another test
			
		}
	}
}
