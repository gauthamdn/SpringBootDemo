package com.springboot.demo.webservices;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.webservices.order.Order;

@RestController
public class SpringBootDemoController {


	
	@GetMapping("/demo/helloworld")
	public String helloWorld() {
				
		return "My First Spring Boot Service";
	}
	
	

	
//	
//	public Order createOrder() {
//		
//		Order sampleOrder2 = new Order();
//		
//	}
//	
//	
//	public String updateOrder() {
//		
//		return "Successfully Updated Order"+orderNumber
//	}
//	
//	
//
//	
//	
//	public int deleteOrder() {
//		
//	}
	
}
