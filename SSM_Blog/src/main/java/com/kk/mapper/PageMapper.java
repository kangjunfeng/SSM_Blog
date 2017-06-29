package com.kk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kk.entity.MBlogContent;

public interface PageMapper {

	/**
	 * 获取总数
	 * @param uid
	 * @return
	 */
	Integer getAmount(Integer uid);
	
	/**
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<MBlogContent> getBlogContent(@Param("uid") Integer userID,@Param("start") Integer start,@Param("pageSize") Integer pageSize);
	
}
