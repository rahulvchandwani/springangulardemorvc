package com.rvc.transformation;

import java.util.ArrayList;
import java.util.List;

import com.rvc.entity.UserEntity;
import com.rvc.transferobject.UserTO;

public class UserTransformation {
	
	public static UserTO getTOFromEntity(UserEntity entity) {
		UserTO to = new UserTO();
		to.setId(entity.getId());
		to.setFirstName(entity.getFirstName());
		to.setLastName(entity.getLastName());
		return to;
	}
	
	public static UserEntity getEntityFromTO(UserTO to) {
		UserEntity entity = new UserEntity();
		entity.setId(to.getId());
		entity.setFirstName(to.getFirstName());
		entity.setLastName(to.getLastName());
		return entity;
	}
	
	public static List<UserTO> getTOsFromEntities(List<UserEntity> entities) {
		List<UserTO> tos = new ArrayList<UserTO>();
		for(UserEntity entity : entities) {
			UserTO to = getTOFromEntity(entity);
			tos.add(to);
		}
		return tos;
	}
	
	public static List<UserEntity> getEntitiesFromTOs(List<UserTO> tos) {
		List<UserEntity> entities = new ArrayList<UserEntity>();
		for(UserTO to : tos) {
			UserEntity entity = getEntityFromTO(to);
			entities.add(entity);
		}
		return entities;
	}
}
