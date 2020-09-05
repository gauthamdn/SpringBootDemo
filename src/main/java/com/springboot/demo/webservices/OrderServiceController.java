package com.springboot.demo.webservices;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.webservices.order.Order;

@RestController
public class OrderServiceController {

	// this controller class will be used to expose the REST service to carry out the 
	//basic CRUD operations on an order object 
	// The demo webservice methods that we will create are  
	// QueryOrder
	// CreateOrder
	// UpdateOrder
	// DeleteOrder
	
	
	// Creating Sample data
	int orderSequence = 1;
	Order sampleOrder1 = new Order(orderSequence, "AmazonFirestickTV",2,new Date(),"Gautham", 199.98);
	Order sampleOrder2 = new Order(++orderSequence, "AmazonFirestickTV",1,new Date(),"Ravi", 99.99);
	
	
	// Get method to query all orders
	@GetMapping("/query/allorders")
	public List<Order> queryOrderInfo() {
		return Arrays.asList(sampleOrder1, sampleOrder2);
	}
		
	// Put method to update information in existing order
	@PutMapping("/update/order/customername/{customername}")
	public Order CreateOrder(@PathVariable String customername) {
		sampleOrder1.setCustomerName(customername);
		return sampleOrder1;		
	}
	
	// Post method to create a new order
	@PostMapping("/create/order/{productname}/quantity/{qty}")
	public Order CreateOrder(@PathVariable String productname, @PathVariable int qty ) {
		
		Order sampleOrder = new Order(++orderSequence,productname,qty,new Date(),"Random Customer", 99.00*qty);
		return sampleOrder;
		
	}	
	
}
