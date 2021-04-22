package ase.csie.cts.assignment3.decorator;

import ase.csie.cts.assignment3.factory.Client;

public class UserConnectionDecorator extends User{

	
	
	public UserConnectionDecorator(Client client) {
		super(client.name, client.surname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void joinSignalRGroup() {
		// TODO Auto-generated method stub
		
	}

}
