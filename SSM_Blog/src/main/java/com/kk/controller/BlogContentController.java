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
import com.kk.service.PageService;


@Controller
public class BlogContentController {
	
	@Autowired
	MBlogContentService blogContentService;
	
	@Autowired
	PageService pageService;
	
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
	
	@RequestMapping(value="getPartBlogContent",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getPartBlogContent(HttpServletRequest request, HttpServletResponse response){
		
		Integer userID = Integer.valueOf(request.getParameter("userID"));
		Integer currentPage =Integer.valueOf(request.getParameter("currentPage"));
		Integer pageSize =Integer.valueOf(request.getParameter("pageSize"));
		
		List<MBlogContent> blogList = pageService.getBlogContent(userID,(currentPage-1)*pageSize, pageSize);
		Integer totalCount = pageService.getAmount(userID);
		Integer pageNum = totalCount%pageSize==0 ? totalCount/pageSize:(totalCount/pageSize)+1;
		
		Map<String, Object> map =new HashMap<>();
		map.put("blogList", blogList);
		map.put("pageNum", pageNum);
		System.out.println(map);
		return map;
	}
}
