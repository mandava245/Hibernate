package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		
		//Oracle DataBase
		Configuration oracleConfiguration = new Configuration();
		oracleConfiguration.configure("com/hibernate/xml/oracle-hibernate.cfg.xml");
		SessionFactory oracleSessionFactory = oracleConfiguration.buildSessionFactory();
		Session oracleSession = oracleSessionFactory.openSession();
		Transaction oracleTransaction = oracleSession.beginTransaction();
		
		//MySQL DataBase
		Configuration mysqlConfiguration = new Configuration();
		mysqlConfiguration.configure("com/hibernate/xml/mysql-hibernate.cfg.xml");
		SessionFactory mysqlSessionFactory = mysqlConfiguration.buildSessionFactory();
		Session mysqlSession = mysqlSessionFactory.openSession();
		Transaction mysqlTransaction = mysqlSession.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEmpId(102);
		employee.setEmpName("Gregg");
		employee.setEmpSalary(40000);
		
		oracleSession.save(employee);
		mysqlSession.save(employee);
		
		mysqlTransaction.commit();
		oracleTransaction.commit();
		
		System.out.println("Employee Registered Successfully in Two DataBases...!!!");
		
	}

}
