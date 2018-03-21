package com.scp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.entities.UserEntity;
import com.scp.user.dao.UserDao;
import com.scp.utilities.SessionFactoryUtil;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sfactory;
	
	public UserDaoImpl() {
		super();
		System.out.println("inside UserServiceImpl..!");
	}
	
	public boolean addUser(UserEntity user) {
		//SessionFactory sfactory = 
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(user);
		SessionFactoryUtil.clearDAOResources(session, tr);
		return true;
	}

	public boolean deleteUser(int id) {
		//SessionFactory sfactory = SessionFactoryUtil.getSFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(getUser(id));
		SessionFactoryUtil.clearDAOResources(session, tr);
		return true;
	}

	public boolean updateUser(UserEntity user) {
	//	SessionFactory sfactory = SessionFactoryUtil.getSFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(user);
		SessionFactoryUtil.clearDAOResources(session, tr);
		return true;
	}

	public UserEntity getUser(int uid) {
		//SessionFactory sfactory = SessionFactoryUtil.getSFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		UserEntity entity = session.get(UserEntity.class,uid);
		SessionFactoryUtil.clearDAOResources(session, tr);
		return entity;
	}

	public List<UserEntity> getUsers() {
		//SessionFactory sfactory = SessionFactoryUtil.getSFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		List<UserEntity> listOfEntities = session.createQuery("from UserEntity").list();
		SessionFactoryUtil.clearDAOResources(session, tr);
		return listOfEntities;
	}

}
