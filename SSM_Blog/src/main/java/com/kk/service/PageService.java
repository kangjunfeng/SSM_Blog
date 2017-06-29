package com.kk.service;

import java.util.List;
import com.kk.entity.MBlogContent;

public interface PageService {

	/**
	 * 获取总数
	 * @param uid
	 * @return
	 */
	public Integer getAmount(Integer uid);
	
	/**
	 * 获取指定页的数据
	 * @param uid
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<MBlogContent> getBlogContent(Integer uid,Integer start,Integer pageSize);
}
