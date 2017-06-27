package com.kk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.entity.MBlogContent;
import com.kk.mapper.MBlogContentMapper;
import com.kk.service.MBlogContentService;


@Service
public class MBlogContentServiceImpl implements MBlogContentService{

	@Autowired
	MBlogContentMapper blogContentMapper;
	
	@Override
	public List<MBlogContent> findAllBlog(Integer userID) {
		
		List<MBlogContent> contentList =blogContentMapper.findAllBlog(userID);
		
		return contentList;
	}

}
