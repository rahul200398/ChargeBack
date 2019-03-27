package com.cts.chargeback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.chargeback.dao.UserDAO;

import com.cts.chargeback.entity.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("In Service");
		userDAO.saveUser(user);
	}

	

}
