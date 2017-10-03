package com.rvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rvc.service.UserService;
import com.rvc.transferobject.UserTO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserTO> getUsers() {
		return userService.getUsers();
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUserDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserTO getUserDetails(@RequestBody Long id) {
		return userService.getUser(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Boolean addUser(@RequestBody UserTO user) {
		return userService.addUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Boolean updateUser(@RequestBody UserTO user) {
		return userService.updateUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Boolean deleteUser(@RequestBody UserTO user) {
		return userService.deleteUser(user);
	}
}
