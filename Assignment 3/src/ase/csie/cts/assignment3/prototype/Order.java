package ase.csie.cts.assignment3.prototype;

import java.util.HashMap;

import ase.csie.cts.assignment3.builder.Restaurant;
import ase.csie.cts.assignment3.builder.Stage;
import ase.csie.cts.assignment3.builder.services.CoordinatesService;
import ase.csie.cts.assignment3.factory.Client;
import ase.csie.cts.assignment3.factory.Courier;

public class Order implements Cloneable {
	
	Client client=null;
	Courier courier=null;
	Restaurant restaurant=null;
	String deliveryAddress;
	HashMap<String, Double> deliveryCoordinates;
	String orderNotes;
	Stage stage=null;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Order orderCopy= new Order();
		orderCopy.client=this.client;
		orderCopy.deliveryAddress=this.deliveryAddress;
		orderCopy.deliveryCoordinates=(HashMap<String, Double>)this.deliveryCoordinates.clone();
		orderCopy.orderNotes=this.orderNotes;
		orderCopy.restaurant=this.restaurant;
		
		if(this.stage!=null)
			orderCopy.stage=this.stage;

		if(this.courier!=null)
			orderCopy.courier=this.courier;
		
		return orderCopy;
	}
	
	public Order(Client client, Courier courier, Restaurant restaurant, String deliveryAddress, String orderNotes, Stage stage) {
		super();
		this.client = client;
		this.courier = courier;
		this.restaurant = restaurant;
		this.deliveryAddress = deliveryAddress;
		this.deliveryCoordinates=CoordinatesService.getCoordinatesFromApi(deliveryAddress);

		this.orderNotes = orderNotes;
		this.stage = stage;
	}
	
	private Order() {
	
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
			this.order.deliveryCoordinates=CoordinatesService.getCoordinatesFromApi(deliveryAddress);
			
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
