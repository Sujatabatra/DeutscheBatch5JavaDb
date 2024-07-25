package com.sujata.entity;

public class CustomerShareDetail {

	private String customerId;
	private String shareName;
	private int quantity;
	private double marketPrice;
	private double totalShareValue;

	public CustomerShareDetail() {

	}

	public CustomerShareDetail(String customerId, String shareName, int quantity, double marketPrice,
			double totalShareValue) {
		super();
		this.customerId = customerId;
		this.shareName = shareName;
		this.quantity = quantity;
		this.marketPrice = marketPrice;
		this.totalShareValue = totalShareValue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public double getTotalShareValue() {
		return totalShareValue;
	}

	public void setTotalShareValue(double totalShareValue) {
		this.totalShareValue = totalShareValue;
	}

}
