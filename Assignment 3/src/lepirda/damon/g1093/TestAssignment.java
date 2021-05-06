package lepirda.damon.g1093;

import lepirda.damon.g1093.builder.Order;
import lepirda.damon.g1093.builder.Restaurant;
import lepirda.damon.g1093.builder.Stage;
import lepirda.damon.g1093.builder.Order.OrderBuilder;
import lepirda.damon.g1093.decorator.UserConnectionDecorator;
import lepirda.damon.g1093.factory.Client;
import lepirda.damon.g1093.factory.Courier;
import lepirda.damon.g1093.factory.User;
import lepirda.damon.g1093.factory.UserFactory;
import lepirda.damon.g1093.factory.UserType;
import lepirda.damon.g1093.proxy.AuthProxy;
import lepirda.damon.g1093.proxy.AuthProvider;
import lepirda.damon.g1093.singleton.DatabaseConnection;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//bulider
		Client client= new Client("Popescu", "Adrian");
		Restaurant restaurant= new Restaurant();
		OrderBuilder orderBuilder= new Order.OrderBuilder(client,restaurant,"Str. Popa Farcas 34");
		orderBuilder.setOrderNotes("I don't like pickles, pls no pickles");
		orderBuilder.setStage(Stage.WAITING);
		Order order = orderBuilder.getOrder();
		
		//decorator
		Client client2= new Client ("gigi", "gigel");
		client2= new UserConnectionDecorator(client);
		client2.joinSignalRGroup();
		
		//factory
		User client3= UserFactory.getUser(UserType.CLIENT, "Lepirda", "Damon");
		User curier= UserFactory.getUser(UserType.COURIER, "Popescu", "Marcel");
		
		client3.joinSignalRGroup();
		curier.joinSignalRGroup();
		
		//prototype
		lepirda.damon.g1093.prototype.Order order1= new lepirda.damon.g1093.prototype.Order.OrderBuilder(new Client("Bob","Bob"), new Restaurant(), "Str. Sperantei 34").getOrder();
		System.out.println(order1.getDeliveryCoordinates().get("lat"));
		lepirda.damon.g1093.prototype.Order order2= (lepirda.damon.g1093.prototype.Order) order1.clone();
		System.out.println(order2.getDeliveryCoordinates().get("lat"));
		
		//singleton
		DatabaseConnection connection1= DatabaseConnection.getDatabaseConnection();
//		DatabaseConnection connection2= new DatabaseConnection();
		
		//proxy
		AuthProxy authProxy = new AuthProxy(new AuthProvider());
		Client client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 
		client4= (Client) authProxy.authRequest("client@gmail.com", "33", UserType.CLIENT); 

		Courier courier = (Courier) authProxy.authRequest("curier@gmail.com", "12345", UserType.COURIER);
	}

}
