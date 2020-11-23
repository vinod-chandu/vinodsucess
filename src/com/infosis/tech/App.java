package com.infosis.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		MyEmployee myEmployee = new MyEmployee();

		myEmployee.setEmpId(161);
		myEmployee.setEmp_Name("CHANDU");
		myEmployee.setSal(258.25);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();

		transaction.begin();
		session.save(myEmployee);
		transaction.commit();
		System.out.println("TRANSACTIONS IS SAVED");

		boolean contains = session.contains(myEmployee);
		System.out.println(contains);

		session.close();

		sessionFactory.close();
		System.out.println(" SUCESSFULLY COMPLTED TRANSACTION");

	}

}
