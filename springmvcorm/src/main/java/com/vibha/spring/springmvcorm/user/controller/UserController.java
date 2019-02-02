package com.vibha.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vibha.spring.springmvcorm.user.entity.User;
import com.vibha.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("registrationPage")//this method is invoked when we hit the url with /registrationPage
	public String showRegistrationPage()
	{
		return "userReg";
	}
	
	@RequestMapping(value = "registerUser" ,method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model)
	{
		int result = service.save(user);
		model.addAttribute("result","User created with ID "+result);
		return "userReg";
	}
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	

}
