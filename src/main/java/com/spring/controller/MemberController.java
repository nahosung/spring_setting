package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.MemberService;

@Controller
@RequestMapping("/test")
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping("/usercheck")
	public String usercheck() throws Exception{
		int cnt = 0;
		cnt = memberservice.userIdCheck("admin");
		
		return "main/index";
	}
}
