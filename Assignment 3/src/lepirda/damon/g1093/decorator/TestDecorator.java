package lepirda.damon.g1093.decorator;

import lepirda.damon.g1093.factory.Client;

public class TestDecorator {

	public static void main(String[] args) {
		Client client= new Client("gigi", "gigel");
		client= new UserConnectionDecorator(client);
		client.joinSignalRGroup();
	}

}
