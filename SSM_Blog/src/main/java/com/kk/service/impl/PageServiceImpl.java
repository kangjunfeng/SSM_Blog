package com.kk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kk.entity.MBlogContent;
import com.kk.mapper.PageMapper;
import com.kk.service.PageService;

@Service
public class PageServiceImpl implements PageService {

	@Autowired
	PageMapper pageMapper;
	
	@Override
	public Integer getAmount(Integer uid) {
		return pageMapper.getAmount(uid) ;
	}
	
	@Override
	public List<MBlogContent> getBlogContent(Integer uid, Integer start, Integer pageSize) {
		return pageMapper.getBlogContent(uid, start, pageSize);
	}

}
