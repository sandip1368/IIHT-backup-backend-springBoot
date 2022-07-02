package com.junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitTestingApplicationTests {

	private Calculator c= new Calculator();
	@Test
	void contextLoads() {
	}

	
	
	@Test
	void sumTest() {
		int expectedrst=50;
		
		int actualResult=c.doSum(12,15,23);
		
		
		assertThat(actualResult).isEqualTo(expectedrst);
	}
	@Test
	void productTest() {
		int expectedrst=20;
		
		int actualResult=c.doProduct(2,10);
		
		
		assertThat(actualResult).isEqualTo(expectedrst);
	}
}
