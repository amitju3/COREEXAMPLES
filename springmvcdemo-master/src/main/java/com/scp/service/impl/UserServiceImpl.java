package com.scp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.beans.UserBean;
import com.scp.dao.impl.UserDaoImpl;
import com.scp.entities.UserEntity;
import com.scp.service.UserService;
import com.scp.user.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public boolean addUser(UserBean user) {
		return userDao.addUser(processBeanToEntity(user));
	}

	public boolean deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	public boolean updateUser(UserBean user) {
		return userDao.updateUser(processBeanToEntity(user));
	}

	public UserBean getUser(int uid) {
		UserEntity entity = userDao.getUser(uid);
		return processEntityToBean(entity);
	}

	public List<UserBean> getUsers() {
		return processEntitiesToBeans(userDao.getUsers());
	}
	
	private UserEntity processBeanToEntity(UserBean bean){
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(bean.getFname());
		userEntity.setLastName(bean.getLname());
		userEntity.setAddress(bean.getuAddress());
		userEntity.setPhoneNo(bean.getUserPhone());
		userEntity.setUserId(bean.getUserId());
		return userEntity;
		
	}
	
	

	private List<UserBean> processEntitiesToBeans(List<UserEntity> entities){
		UserBean userbean =null;
		List<UserBean> listOfUsers = new ArrayList<UserBean>();
		for (UserEntity bean : entities) {
			userbean = new UserBean();
			userbean.setUserId(bean.getUserId());
			userbean.setFname(bean.getFirstName());
			userbean.setLname(bean.getLastName());
			userbean.setuAddress(bean.getAddress());
			userbean.setUserPhone(bean.getPhoneNo());
			listOfUsers.add(userbean);
		}
		
		
		return listOfUsers;
		
	}

	
	

	private UserBean processEntityToBean(UserEntity entity){
		UserBean userbean = new UserBean();
		userbean.setUserId(entity.getUserId());
		userbean.setFname(entity.getFirstName());
		userbean.setLname(entity.getLastName());
		userbean.setuAddress(entity.getAddress());
		userbean.setUserPhone(entity.getPhoneNo());
		return userbean;
		
	}

	

}
