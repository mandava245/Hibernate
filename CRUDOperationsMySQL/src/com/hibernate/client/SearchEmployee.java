package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class SearchEmployee {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/xml/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Employee employee = (Employee) session.get(Employee.class, 88);

		System.out.println("Employee Details:");
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());

	}

}
