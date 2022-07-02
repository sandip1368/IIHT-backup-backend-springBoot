package com.order_management.service;

import java.util.List;

import com.order_management.entity.OrderEntity;

public interface IOrderService {

	public Integer saveOrder(OrderEntity order);

	public List<OrderEntity> getAllOrder();

	public OrderEntity gellByIdOrder(Integer order_id);

	public OrderEntity updateOrderData(OrderEntity employee, Integer order_id);

	public void deleteOrderById(Integer order_id);

}
