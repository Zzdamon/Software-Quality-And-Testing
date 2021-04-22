package ase.csie.cts.assignment3.decorator;

import ase.csie.cts.assignment3.factory.Client;

public class TestDecorator {

	public static void main(String[] args) {
		Client client= new Client("gigi", "gigel");
		client= new UserConnectionDecorator(client);
	}

}
