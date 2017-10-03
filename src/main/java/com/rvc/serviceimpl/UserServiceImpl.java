package com.rvc.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rvc.entity.UserEntity;
import com.rvc.service.UserService;
import com.rvc.transferobject.UserTO;
import com.rvc.transformation.UserTransformation;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	/*@Autowired
	private UserDao userDao;*/
	
	public List<UserTO> getUsers() {
//		List<UserEntity> entities = userDao.findAll();
		List<UserEntity> entities = new ArrayList<UserEntity>();
		UserEntity entity = new UserEntity();
		entity.setId(1L);
		entity.setFirstName("Rahul");
		entity.setLastName("Chandwani");
		entities.add(entity);
		return UserTransformation.getTOsFromEntities(entities);
	}

	public UserTO getUser(Long id) {
//		UserEntity entity = userDao.findById(id);
		UserEntity entity = new UserEntity();
		return UserTransformation.getTOFromEntity(entity);
	}

	public Boolean addUser(UserTO user) {
		UserEntity entity = UserTransformation.getEntityFromTO(user);
//		return userDao.save(entity);
		return true;
	}

	public Boolean updateUser(UserTO user) {
		UserEntity entity = UserTransformation.getEntityFromTO(user);
//		return userDao.update(entity);
		return true;
	}

	public Boolean deleteUser(UserTO user) {
		UserEntity entity = UserTransformation.getEntityFromTO(user);
//		return userDao.delete(entity);
		return true;
	}

}
