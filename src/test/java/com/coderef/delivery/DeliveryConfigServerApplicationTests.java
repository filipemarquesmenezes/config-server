package com.coderef.delivery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeliveryConfigServerApplicationTests {

	@Test
	public void testAnything() {
		assertEquals(1, 1);
	}
	
	@Test
	public void contextLoads() {
		System.out.println("DeliveryConfigServerApplicationTests.contextLoads()");
	}

}
