package com.order_management;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.order_management.entity.OrderEntity;
import com.order_management.service.OrderRepository;
import com.order_management.service.OrderServicImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderManagementSystemApplicationTests {
	
	
	@Autowired
	private OrderServicImpl orderService;
	
	@MockBean
	private OrderRepository orderrepository;
	

	@Test
	void getAllOrderTest() {
		when(orderrepository.findAll()).thenReturn(Stream.of(new OrderEntity(1,"tv",5500,"sony"),
				new OrderEntity(2,"mobile",1000,"apple")).collect(Collectors.toList()));
		
		assertEquals(2, orderService.getAllOrder().size());
		
}
	@Test
	public void saveOrderTest()
	{
		OrderEntity orderEntity= new OrderEntity(1,"burger",1000,"bvcg");
		
		when(orderrepository.save(orderEntity)).thenReturn(orderEntity);
	
		assertEquals(1,orderService.saveOrder(orderEntity));
	}

}
