package com.louis.kitty.admin.model;

/**
 * ---------------------------
 * 商机 (Business)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Business {

	/**  */
	private Long id;
	/** 客户 */
	private Integer cusId;
	/**  */
	private String busName;
	/**  */
	private Integer busStatus;
	/**  */
	private java.util.Date gmtCreate;
	/**  */
	private java.util.Date gmtModify;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Integer getBusStatus() {
		return busStatus;
	}

	public void setBusStatus(Integer busStatus) {
		this.busStatus = busStatus;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(java.util.Date gmtModify) {
		this.gmtModify = gmtModify;
	}

}