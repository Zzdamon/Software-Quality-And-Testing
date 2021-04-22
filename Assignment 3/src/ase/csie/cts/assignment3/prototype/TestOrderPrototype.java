package ase.csie.cts.assignment3.prototype;

import ase.csie.cts.assignment3.builder.Restaurant;
import ase.csie.cts.assignment3.factory.Client;

public class TestOrderPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Order order= new Order.OrderBuilder(new Client("Bob","Bob"), new Restaurant(), "Str. Sperantei 34").getOrder();
		System.out.println(order.deliveryCoordinates.get("lat"));
		Order order2= (Order) order.clone();
		System.out.println(order2.deliveryCoordinates.get("lat"));

	}

}
