package com.sujata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * 1. Mapping the class with the table in Database
 * 
 */
@Entity   //if not specifying any table name, then table name will be same as that of your class name
@Table(name="Customer")
public class Customer {

	/*
	 * if you are not specifying column names then column names will be same as that of your property names
	 */
	@Id   //primary key
	@Column(name="detailId")
	private int detailId;
	
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="shareId")
	private int shareId;
	
	@Column(name="shareType")
	private String shareType;

	@Column(name="quantity")
	private int quantity;
	
	public Customer() {
		
	}
	public Customer(int detailId, String customerId, int shareId, String shareType, int quantity) {
		super();
		this.detailId = detailId;
		this.customerId = customerId;
		this.shareId = shareId;
		this.shareType = shareType;
		this.quantity = quantity;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getShareId() {
		return shareId;
	}
	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
	public String getShareType() {
		return shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Customer [detailId=" + detailId + ", customerId=" + customerId + ", shareId=" + shareId + ", shareType="
				+ shareType + ", quantity=" + quantity + "]";
	}
	

}
