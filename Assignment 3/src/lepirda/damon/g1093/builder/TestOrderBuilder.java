package lepirda.damon.g1093.builder;

import lepirda.damon.g1093.builder.Order.OrderBuilder;
import lepirda.damon.g1093.factory.Client;

public class TestOrderBuilder {

	public static void main(String[] args) {

		Client client= new Client("Popescu", "Adrian");
		Restaurant restaurant= new Restaurant();
		OrderBuilder orderBuilder= new Order.OrderBuilder(client,restaurant,"Str. Popa Farcas 34");
		orderBuilder.setOrderNotes("I don't like pickles, pls no pickles");
		orderBuilder.setStage(Stage.WAITING);
		Order order = orderBuilder.getOrder();
		
	}

}
