package com.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberdao;
	
	@Override
	public int userIdCheck(String userid) throws Exception{
		return memberdao.userIdCheck(userid);
		
	}
}
