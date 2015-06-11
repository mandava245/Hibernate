package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class ClientApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setEmployeeId(84);
		employee.setEmployeeName("Chaitanya");
		employee.setSalary(42000);

		Object employee2 = session.save(employee);
		transaction.commit();

		System.out.println("Employee Id : " + employee2);

	}

}
