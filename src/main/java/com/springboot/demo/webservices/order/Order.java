package com.springboot.demo.webservices.order;

import java.util.Date;

public class Order {

	private int OrderNumber;
	private String ProductDescription;
	private int ProductQuantity;
	private Date OrderDate;
	private String CustomerName;
	private double OrderAmount;
	

	public Order() {
		
	}

	public Order(int orderNumber, String productDescription, int productQuantity, Date orderDate, String customerName,
			double orderAmount) {
		super();
		OrderNumber = orderNumber;
		ProductDescription = productDescription;
		ProductQuantity = productQuantity;
		OrderDate = orderDate;
		CustomerName = customerName;
		OrderAmount = orderAmount;
	}

	public int getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public int getProductQuantity() {
		return ProductQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public double getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Order [OrderNumber=" + OrderNumber + ", ProductDescription=" + ProductDescription + ", ProductQuantity="
				+ ProductQuantity + ", OrderDate=" + OrderDate + ", CustomerName=" + CustomerName + ", OrderAmount="
				+ OrderAmount + "]";
	}
	
		
	
}

