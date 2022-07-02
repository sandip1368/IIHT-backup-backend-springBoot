package com.order_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.order_management.entity.OrderEntity;
import com.order_management.exception.OrderNotFoundException;



@Service
public class OrderServicImpl implements IOrderService {
	
	
	@Autowired
	private OrderRepository OrderRepository;

	@Override
	public Integer saveOrder(OrderEntity order) {
		
		OrderEntity orderEntity=OrderRepository.save(order);
		
		System.out.println("recordsave"+orderEntity);
		return orderEntity.getOrder_id();
	}

	public List<OrderEntity> getAllOrder() {
		
		List<OrderEntity> orderEntity= OrderRepository.findAll();
		System.out.println("getting date from DataBase"+orderEntity);
		return orderEntity;
	}

	@Override
	public OrderEntity gellByIdOrder(Integer id) {
		// TODO Auto-generated method stub
		Optional<OrderEntity> order_data= OrderRepository.findById(id);
		if(order_data.isPresent())
		{
			return order_data.get();
			
		}
		else {
		      throw new OrderNotFoundException("order data is  Not present in database"+id,HttpStatus.NOT_FOUND);
		}

		}

	@Override
	public OrderEntity updateOrderData(OrderEntity order, Integer order_id) {
		
		OrderEntity orderEntity=OrderRepository.findById(order_id)
				.orElseThrow( ()-> new OrderNotFoundException("order data not found exception"+order_id,HttpStatus.NOT_FOUND));
		
		orderEntity.setOrder_name(order.getOrder_name());
		orderEntity.setOrder_price(order.getOrder_price());
		orderEntity.setBrand(order.getBrand());
		return OrderRepository.save(orderEntity);
	}

	public void deleteOrderById(Integer order_id) {
	
		OrderRepository.deleteById(order_id);
		
	}

}
