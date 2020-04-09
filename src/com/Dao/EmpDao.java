package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Bean.EmpBean;
import com.Bean.EmpPersonInfo;
import com.Util.EmpUtil;

public class EmpDao {
	
	public static void insertEmp(EmpBean e) {
		Session session=EmpUtil.createSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
	}
	public static void insertEmpPersonInfo(EmpPersonInfo eid) {
		Session session=EmpUtil.createSession();
		Transaction tx=session.beginTransaction();
		session.save(eid);
		tx.commit();
		session.close();
	}
	public static void updateEmp(EmpBean e) {
		Session session=EmpUtil.createSession();
		Transaction tx=session.beginTransaction();
		session.update(e);
		tx.commit();
		session.close();
	}
	public static List<EmpBean> getAllEmployees() {
		Session session=EmpUtil.createSession();
		List<EmpBean> emp=session.createQuery("from EmpBean").list();
		session.close();
		return emp;
	}
	public static void deleteEmp(int id) {
		Session session = EmpUtil.createSession();
		Transaction tx=session.beginTransaction();
		EmpBean e=session.get(EmpBean.class, id);
		session.delete(e);
		tx.commit();
		session.close();
	}
	
	public static EmpBean getEmpById(int id) {
		Session session=EmpUtil.createSession();
		EmpBean emp=session.get(EmpBean.class, id);
		session.close();
		return emp;
	}
}