package com.kk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.entity.MUser;
import com.kk.mapper.MUserMapper;
import com.kk.service.MUserService;

@Service
public class MUserServiceImpl implements MUserService{

	@Autowired
	private MUserMapper userMapper;
	
	public MUser login(String username, String password) {
		
		MUser  user = userMapper.searchUserByUserName(username,password);
		return user;
	}

}
