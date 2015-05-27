package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class ClientAppInsert {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		String xml = "com/hibernate/xml/hibernate.cfg.xml";
		configuration.configure(xml);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(84);
		emp.setEmpName("Chaithanya");
		emp.setSalary(45000);
		session.save(emp);
		transaction.commit();
		System.out.println("Record Inserted Successfully...!!!");
	}

}
