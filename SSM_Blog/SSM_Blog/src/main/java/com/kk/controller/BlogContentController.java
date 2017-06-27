package com.kk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kk.entity.MBlogContent;
import com.kk.service.MBlogContentService;


@Controller
public class BlogContentController {
	
	@Autowired
	MBlogContentService blogContentService;
	
	@RequestMapping(value="getAllBlog",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> findAllBlog(HttpServletRequest request, HttpServletResponse response){
		
		Integer userID = Integer.valueOf(request.getParameter("userID"));
		
		List<MBlogContent> blogList =blogContentService.findAllBlog(userID);
		
		if (blogList.size() ==0) {
			return null;
		}
		
		Map<String, Object> map =new HashMap<>();
		map.put("blogList", blogList);
		System.out.println(map);
		return map;
	}
}
