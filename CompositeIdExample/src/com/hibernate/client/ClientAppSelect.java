package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class ClientAppSelect {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee = new Employee();
		employee.setEmployeeId(84);
		employee.setEmployeeName("Chaitanya");

		Employee emp = (Employee) session.get(Employee.class, employee);

		System.out.println("Employee Details: ");
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getSalary());
	}

}
