package com.order_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order_management.entity.OrderEntity;
import com.order_management.service.IOrderService;

@RestController
@CrossOrigin(origins="*")
public class OrderController {
	@RequestMapping("/")
	public String getMasssge() {
		return "Hello start the programing";
	}
	
	@Autowired
	private IOrderService iorederService; 
	
	@PostMapping("/order")
	public Integer AddOrder(@RequestBody OrderEntity order)
	{
		//System.out.println("start in post");
		Integer getOrder_id=iorederService.saveOrder(order);
		return getOrder_id;
	
		}
	@GetMapping("/orders")
	public List<OrderEntity> getAllOrderDetails()
	{
		return iorederService.getAllOrder();
	}
	
	
	//only faech data depends on id
	@GetMapping("/order/{id}")
	public ResponseEntity<OrderEntity> getBYIdOrderDetails(@PathVariable("id") Integer id)
	{
		OrderEntity order=iorederService.gellByIdOrder(id);
	 
	 return new ResponseEntity<OrderEntity>(order,HttpStatus.OK);
	}
	
	
	
	// Update order details 
	@PutMapping("/order/{order_id}")
	public ResponseEntity<OrderEntity> updateStudentData(@RequestBody OrderEntity order, @PathVariable("order_id") Integer order_id)
	{
		System.out.println("start contr ser");
		OrderEntity ord=iorederService.updateOrderData(order, order_id);
		
	return new ResponseEntity<OrderEntity>(ord,HttpStatus.OK);
	}

	

	
	
	
	
	//Delete order 
	@DeleteMapping("/order/{order_id}")
	public ResponseEntity<?> deleteOrder(@PathVariable("order_id") Integer order_id)
	{
		iorederService.deleteOrderById(order_id);
		return ResponseEntity.ok().body("order delete succesfully");
	
		
		
	}
}
