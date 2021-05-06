package lepirda.damon.g1093.proxy;

import lepirda.damon.g1093.factory.User;
import lepirda.damon.g1093.factory.UserType;
import lepirda.damon.g1093.factory.Client;
import lepirda.damon.g1093.factory.Courier;

public class AuthProvider implements AuthInterface {
	public User authRequest(String email, String password,UserType loginType) {
		//select query - search for matching email and password
		//if found, return user
		if(email=="client@gmail.com" && password=="12345" && loginType==UserType.CLIENT) {
			return new Client("Damon","Lepirda");
		}
		if(email=="curier@gmail.com" && password=="12345" && loginType==UserType.COURIER) {
			return new Courier("Bob", "Bobescu", "CT12RTG");
		}
		
		return null;
	}
}
