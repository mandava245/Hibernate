package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/xml/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEmpId(88);
		employee.setEmpName("Pavan");
		employee.setEmpSalary(45000);
		
		session.save(employee);
		transaction.commit();
		System.out.println("Employee Registered Successfully...!!!");
		
	}

}
