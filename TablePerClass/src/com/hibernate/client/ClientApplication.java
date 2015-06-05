package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.HourlyEmployee;
import com.hibernate.pojo.SalaryEmployee;

public class ClientApplication {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/config/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		SalaryEmployee salaryEmployee = new SalaryEmployee();
		salaryEmployee.setEmployeeId(88);
		salaryEmployee.setEmployeeName("Pavan");
		salaryEmployee.setSalary(45000);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		hourlyEmployee.setEmployeeId(84);
		hourlyEmployee.setEmployeeName("Chaitanya");
		hourlyEmployee.setHours(7);
		hourlyEmployee.setSalPerHour(6000);
		
		session.save(salaryEmployee);
		session.save(hourlyEmployee);
		
		transaction.commit();
		System.out.println("Successfully Inserted Employees Data");
	}

}
