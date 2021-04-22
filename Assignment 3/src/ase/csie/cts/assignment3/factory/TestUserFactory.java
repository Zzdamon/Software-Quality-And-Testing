package ase.csie.cts.assignment3.factory;

public class TestUserFactory {

	public static void main(String[] args) {
		User client= UserFactory.getUser(UserType.CLIENT, "Lepirda", "Damon");
		User curier= UserFactory.getUser(UserType.COURIER, "Popescu", "Marcel");
		
		client.joinSignalRGroup();
		curier.joinSignalRGroup();
		
	}

}
