package com.kk.entity;

public class MBlogContent {
	/**
	 * 文章id
	 */
	private Integer titleID;
	/**
	 * 用户id
	 */
	private Integer userID;
	/**
	 * 作者
	 */
	private String  author_name;
	/**
	 * 文章标题
	 */
	private String title;
	/**
	 * 文章类型
	 */
	private String  type;
	/**
	 * 文章描述
	 */
	private String  type_comment;
	/**
	 * 创建时间
	 */
	private Integer created_time;
	/**
	 * 修改时间
	 */
	private Integer modification_time;
	/**
	 * 文章内容
	 */
	private String  content;
	/**
	 * 评论数
	 */
	private Integer comments_num;
	/**
	 * 浏览量
	 */
	private Integer pageview;
	/**
	 * 分类
	 */
	private String  categories;
	/**
	 * 状态
	 */
	private String  status;
	/**
	 * 文章标签
	 */
	private String  tags;
	
	
	public Integer getTitleID() {
		return titleID;
	}
	public void setTitleID(Integer titleID) {
		this.titleID = titleID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}
	public Integer getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Integer created_time) {
		this.created_time = created_time;
	}
	public Integer getModification_time() {
		return modification_time;
	}
	public void setModification_time(Integer modification_time) {
		this.modification_time = modification_time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getComments_num() {
		return comments_num;
	}
	public void setComments_num(Integer comments_num) {
		this.comments_num = comments_num;
	}
	public Integer getPageview() {
		return pageview;
	}
	public void setPageview(Integer pageview) {
		this.pageview = pageview;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	

}
