package ase.csie.cts.assignment3.factory;

public class UserFactory {

	
	public static User getUser(UserType type,String name, String surname) {
		User user=null;
		switch (type) {
		case CLIENT :
			user=new Client(name,surname);
			break;
		case COURIER:
			user=new Courier(name,surname,"NA");
		default:
			break;
		}
		return user;
	}
}
