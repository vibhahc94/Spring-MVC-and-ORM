package com.vibha.spring.springmvcorm.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vibha.spring.springmvcorm.user.dao.UserDao;
import com.vibha.spring.springmvcorm.user.entity.User;
import com.vibha.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	@Override
	@Transactional
	public int save(User user) {
		//Business Logic
		return dao.create(user);
		
	}

}
