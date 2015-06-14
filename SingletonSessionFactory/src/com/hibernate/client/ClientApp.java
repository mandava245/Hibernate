package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.pojo.Employee;
import com.hibernate.singleton.SessionFactoryUtil;

public class ClientApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setEmployeeId(84);
		employee.setEmployeeName("Siva");
		employee.setSalary(65000);

		session.save(employee);
		transaction.commit();

		System.out.println("Employee Registered Successfully...!!!");

	}

}
