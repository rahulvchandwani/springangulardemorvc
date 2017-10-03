package com.rvc.service;

import java.util.List;

import com.rvc.transferobject.UserTO;

public interface UserService {
	
	List<UserTO> getUsers();
	
	UserTO getUser(Long id);
	
	Boolean addUser(UserTO user);
	
	Boolean updateUser(UserTO user);
	
	Boolean deleteUser(UserTO user);
}
