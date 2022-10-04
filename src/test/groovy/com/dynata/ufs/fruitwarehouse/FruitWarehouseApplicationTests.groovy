package com.dynata.ufs.fruitwarehouse

import com.dynata.ufs.fruitwarehouse.model.Fruit
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FruitWarehouseApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void testConcatenate() {
		Fruit fruit = new Fruit();

		boolean result = fruit.setFruitName("onion");

		assert (false == result)
	}

}
