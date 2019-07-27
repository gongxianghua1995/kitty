package com.louis.kitty.admin.model;

/**
 * ---------------------------
 *  (Contract)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Contract {

	/**  */
	private Long id;
	/**  */
	private String contractName;
	/**  */
	private java.util.Date gmtCreate;
	/**  */
	private java.util.Date gmtModified;
	/**  */
	private java.util.Date contractStartTime;
	/**  */
	private String contractNumber;
	/**  */
	private String customerName;
	/**  */
	private java.util.Date contractEndTime;
	/**  */
	private String customerSignatory;
	/**  */
	private Float contractAmount;
	/**  */
	private String contractCreator;
	/**  */
	private java.util.Date orderTime;
	/**  */
	private String companySignatory;
	/**  */
	private String contractStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(java.util.Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public java.util.Date getContractStartTime() {
		return contractStartTime;
	}

	public void setContractStartTime(java.util.Date contractStartTime) {
		this.contractStartTime = contractStartTime;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public java.util.Date getContractEndTime() {
		return contractEndTime;
	}

	public void setContractEndTime(java.util.Date contractEndTime) {
		this.contractEndTime = contractEndTime;
	}

	public String getCustomerSignatory() {
		return customerSignatory;
	}

	public void setCustomerSignatory(String customerSignatory) {
		this.customerSignatory = customerSignatory;
	}

	public Float getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(Float contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getContractCreator() {
		return contractCreator;
	}

	public void setContractCreator(String contractCreator) {
		this.contractCreator = contractCreator;
	}

	public java.util.Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(java.util.Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getCompanySignatory() {
		return companySignatory;
	}

	public void setCompanySignatory(String companySignatory) {
		this.companySignatory = companySignatory;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

}