package lepirda.damon.g1093.decorator;

import lepirda.damon.g1093.factory.Client;

public class UserConnectionDecorator extends Client{

	String connection;
	
	public UserConnectionDecorator(Client client) {
		super(client.getName(), client.getSurname());

	}

	@Override
	public void joinSignalRGroup() {
		//gets connection generated from signalR
		this.connection="asddfsdf";
		System.out.println("Joined Client SignalR Group with connection "+this.connection);
		
	}

}
