package com.kk.service;

import java.util.List;

import com.kk.entity.MBlogContent;

public interface MBlogContentService {
	/**
	 * 查找所有blog
	 * @param userID
	 * @return
	 */
	public List<MBlogContent> findAllBlog(Integer userID);
}
