package com.my.project4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.project4.mapper.MUserMapper;
import com.my.project4.model.MUser;
import com.my.project4.serviceImpl.IMUserService;


@Service("muserService")
public class MUserService implements IMUserService{
	@Autowired
	private MUserMapper muserMapper;
		
	public List<MUser> getAll() {
		
		return muserMapper.getAll();
	}

	public int insert(MUser muser) {
		
		return muserMapper.insert(muser);
	}

	public int update(MUser muser) {
		
		return muserMapper.updateByPrimaryKey(muser);
	}

	public int delete(String id) {
	
		return muserMapper.deleteByPrimaryKey(id);
	}

	public MUser selectByPrimaryKey(String id) {
		
		return muserMapper.selectByPrimaryKey(id);
	}

}
