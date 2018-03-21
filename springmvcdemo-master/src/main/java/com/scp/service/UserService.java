package com.scp.service;

import java.util.List;

import com.scp.beans.UserBean;

public interface UserService {

	public boolean addUser(UserBean user);

	public boolean deleteUser(int id);

	public boolean updateUser(UserBean user);

	public UserBean getUser(int uid);

	public List<UserBean> getUsers();

}
