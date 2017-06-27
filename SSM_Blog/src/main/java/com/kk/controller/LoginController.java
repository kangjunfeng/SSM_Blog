package com.kk.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.entity.MUser;
import com.kk.service.MUserService;

@Controller
public class LoginController {

	@Autowired
	private MUserService userService;
	
	@RequestMapping("/login")
	public String login(){
		return "login/login";
	}
	
	@RequestMapping("/index")
	public String home(){
		return "index/index";
	}
	
	@RequestMapping(value="submitLogin",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> submitLogin(HttpServletRequest request,HttpServletResponse response){
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		MUser user =null;
		try {
			user =userService.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		if (user==null) {
			return null;
		}

		Map<String,Object> map  = new  HashMap<String, Object>();
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		map.put("status", "1");
		return map;
	}
}
