package lepirda.damon.g1093.prototype;

import lepirda.damon.g1093.builder.Restaurant;
import lepirda.damon.g1093.factory.Client;

public class TestOrderPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Order order= new Order.OrderBuilder(new Client("Bob","Bob"), new Restaurant(), "Str. Sperantei 34").getOrder();
		System.out.println(order.getDeliveryCoordinates().get("lat"));
		Order order2= (Order) order.clone();
		System.out.println(order2.getDeliveryCoordinates().get("lat"));

	}

}
