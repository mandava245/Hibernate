package com.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/hibernate/xml/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 88);

		/*
		 * Here the need of Checking the Record is there in the Table or not is
		 * because Update Query blindly Executes and doesn't throw any Error if
		 * even the Record was not Found So in this Case if the Record was not
		 * found in the Database update, even though we wont get any Exception
		 * which makes the Developer to think that the Record is Updated So it
		 * is recommended to Retrieve the Employee Details which we are going to
		 * Update and then Check the Employee Instance after Retrieving whether
		 * it is null or not
		 */

		if (employee != null) {
			employee.setEmpName("PavanM");
			employee.setEmpSalary(45000);
			session.update(employee);
			transaction.commit();
			System.out.println("Employee Details Updated Successfully...!!");
		}

	}

}
