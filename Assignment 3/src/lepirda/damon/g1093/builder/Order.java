package lepirda.damon.g1093.builder;

import java.util.HashMap;

import lepirda.damon.g1093.builder.services.CoordinatesService;
import lepirda.damon.g1093.factory.Client;
import lepirda.damon.g1093.factory.Courier;

public class Order {

	Client client=null;
	Courier courier=null;
	Restaurant restaurant=null;
	String deliveryAddress;
	private HashMap<String, Double> deliveryCoordinates;
	String orderNotes;
	Stage stage=null;
	
	public Order(Client client, Courier courier, Restaurant restaurant, String deliveryAddress, String orderNotes, Stage stage) {
		super();
		this.client = client;
		this.courier = courier;
		this.restaurant = restaurant;
		this.deliveryAddress = deliveryAddress;
		this.setDeliveryCoordinates(CoordinatesService.getCoordinatesFromApi(deliveryAddress));

		this.orderNotes = orderNotes;
		this.stage = stage;
	}
	
	private Order() {
	
	}
	
	
	public HashMap<String, Double> getDeliveryCoordinates() {
		return deliveryCoordinates;
	}

	public void setDeliveryCoordinates(HashMap<String, Double> deliveryCoordinates) {
		this.deliveryCoordinates = deliveryCoordinates;
	}


	public static class OrderBuilder{
		 Order order;

		public Order getOrder() {
			return order;
		}

		public OrderBuilder(Client client, Restaurant restaurant, String deliveryAddress) {
			this.order = new Order();
			this.order.client=client;
			this.order.restaurant=restaurant;
			this.order.deliveryAddress=deliveryAddress;
			this.order.setDeliveryCoordinates(CoordinatesService.getCoordinatesFromApi(deliveryAddress));
			
		}
		
		public void setCourier(Courier courier) {
			this.order.courier = courier;
		}

		public void setOrderNotes(String orderNotes) {
			this.order.orderNotes = orderNotes;
		}

		public void setStage(Stage stage) {
			this.order.stage = stage;
		}

		
	}

}
