package com.my.project4.serviceImpl;

import java.util.List;

import com.my.project4.model.MUser;


public interface IMUserService {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
}
