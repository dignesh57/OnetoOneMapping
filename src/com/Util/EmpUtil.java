package com.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.EmpBean;
import com.Bean.EmpPersonInfo;

public class EmpUtil {

	public static Session createSession() {
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(EmpBean.class)
				.addAnnotatedClass(EmpPersonInfo.class).configure().buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}
}
