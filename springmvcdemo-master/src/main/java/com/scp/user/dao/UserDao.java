package com.scp.user.dao;

import java.util.List;

import com.scp.entities.UserEntity;

public interface UserDao {

	public boolean addUser(UserEntity user);

	public boolean deleteUser(int id);

	public boolean updateUser(UserEntity user);

	public UserEntity getUser(int uid);

	public List<UserEntity> getUsers();

}
