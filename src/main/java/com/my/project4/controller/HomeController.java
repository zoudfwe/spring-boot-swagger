package com.my.project4.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.project4.serviceImpl.IUserService;

@Controller
public class HomeController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request,Model model){
		String username = userService.getUsernameById(0);
		model.addAttribute("username",username);
		return "hello";
	}
}
