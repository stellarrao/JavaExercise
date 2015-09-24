package com.yuantel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuantel.dao.UserDao;
import com.yuantel.entity.User;
import com.yuantel.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}

}
