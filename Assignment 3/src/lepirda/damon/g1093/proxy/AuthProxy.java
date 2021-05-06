package lepirda.damon.g1093.proxy;

import java.util.HashMap;

import lepirda.damon.g1093.factory.User;
import lepirda.damon.g1093.factory.UserType;

public class AuthProxy implements AuthInterface {
	AuthInterface authModule = null;
	HashMap<String, Integer> attemptsCounter = new HashMap<>();
	public static final int MAX_ATTEMPTS = 5;
	
	public AuthProxy(AuthInterface authModule) {
		this.authModule = authModule;
	}
	
	@Override
	public User authRequest(String email, String password, UserType loginType) {
		Integer attemptsNumber= attemptsCounter.get(email);
		if(attemptsNumber==null) {
			attemptsCounter.put(email, 0);
			attemptsNumber=0;
		}
		if(attemptsNumber >= MAX_ATTEMPTS)
		{
			//wait 20 minutes until next attempt
			System.out.println("Too many failed attempts! Wait 20 minutes until next attempt");
				
			return null;
		}
		if(this.authModule!=null) {
			User user = this.authModule.authRequest(email, password, loginType);
			if(user==null) {
				attemptsCounter.put(email, attemptsNumber+1);
				System.out.println("Wrong email or password!");
			}
			else {
				attemptsCounter.put(email, 0);
				System.out.println("Succesful authentification!");
			}
			return user;
		}
		else 
			throw new UnsupportedOperationException();
		
	}

}
