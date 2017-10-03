package com.rvc.dao;

import java.util.List;

import com.rvc.entity.UserEntity;

public interface UserDao {
	List<UserEntity> findAll();

	UserEntity findById(Long id);
	
	Boolean save(UserEntity user);
	
	Boolean update(UserEntity user);
	
	Boolean delete(UserEntity user);
}
