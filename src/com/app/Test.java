package com.app;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		tx.begin();
		Student stu = new Student();
		stu.setStuId(101);
		stu.setStdName("Raghu");
		stu.setStuFee(50000.565);

		ses.save(stu);
		tx.commit();
		ses.close();
	}// main()
}// class
