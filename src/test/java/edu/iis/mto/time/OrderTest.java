package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void confirmMethodShouldThrowOrderExpiredException() {
		Order order = new Order();
		order.submit(new CurrentTimeSource());
		order.confirm(new AdvancedTimeSource());
	}

}
