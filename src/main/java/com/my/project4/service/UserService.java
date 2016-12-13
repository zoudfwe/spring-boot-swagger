package com.my.project4.service;

import org.springframework.stereotype.Service;

import com.my.project4.serviceImpl.IUserService;
@Service
public class UserService implements IUserService{

	public String getUsernameById(int id) {
		
		return "kuggi";
	}
	
}
