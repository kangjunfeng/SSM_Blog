package com.kk.mapper;

import java.util.List;
import com.kk.entity.MBlogContent;


public interface MBlogContentMapper {
	
	/**
	 * 查找所有博客
	 * @return
	 */
	List<MBlogContent> findAllBlog(Integer userID);
	
	
}
