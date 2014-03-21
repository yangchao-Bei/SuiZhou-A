package com.example.shenyunsuizhou.json;

/**
 * Json参数总结
 * title  			标题
 * note   			判断此列表是否为滑动列表 值为yes时
 * azhuadong		判断下级页面是否为滑动列表 值为yes为滑动
 * modified_time	时间
 * haveimg			值为yes为有图列表反之则无图
 * cnparams			有图列表与滑动列表显示图片
 * description		内容简介
 * introtext		网页详情显示内容
 * zcategory		获取当前列表等级，如为no则为最下级列表，点击跳转至浏览页面
 * zcategoryurl		获取下级列表的申请数据地址
 * 
 */


public class Test_Model {

	private String title;
	private String note;
	private String modified_time;
	private String cnparams;
	private String description;
	private String zcategory;
	private String zcategoryurl;
	private String introtext;

	

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getModifiedTime() {
		return modified_time;
	}

	public void setModifiedTime(String modified_time) {
		this.modified_time = modified_time;
	}

	public String getCnparams() {
		return cnparams;
	}

	public void setCnparams(String cnparams) {
		this.cnparams = cnparams;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getZcategory() {
		return zcategory;
	}

	public void setZcategory(String zcategory) {
		this.zcategory = zcategory;
	}

	public String getZcategoryurl() {
		return zcategoryurl;
	}

	public void setZcategoryurl(String zcategoryurl) {
		this.zcategoryurl = zcategoryurl;
	}

	public String getIntrotext()
	{
		return introtext;
	}
	public void	setIntrotext(String introtext)
	{
		this.introtext = introtext;
	}
}
