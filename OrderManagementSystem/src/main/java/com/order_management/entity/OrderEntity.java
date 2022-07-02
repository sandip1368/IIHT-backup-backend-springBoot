package com.order_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer order_id;
	private String order_name;
	private int order_price;
	private String brand;
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderEntity(Integer order_id, String order_name, int order_price, String brand) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.order_price = order_price;
		this.brand = brand;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public int getOrder_price() {
		return order_price;
	}
	public String getBrand() {
		return brand;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "OrderEntity [order_id=" + order_id + ", order_name=" + order_name + ", order_price=" + order_price
				+ ", brand=" + brand + "]";
	}
	

}
