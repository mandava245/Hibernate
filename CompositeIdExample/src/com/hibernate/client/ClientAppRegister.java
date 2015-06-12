package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class ClientAppRegister {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setEmployeeId(63);
		employee.setEmployeeName("Siva");
		employee.setSalary(65000);

		session.save(employee);
		transaction.commit();

		System.out.println("Employee Registered Successfully...!!!");
	}

}
