package com.order_management.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order_management.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

}
