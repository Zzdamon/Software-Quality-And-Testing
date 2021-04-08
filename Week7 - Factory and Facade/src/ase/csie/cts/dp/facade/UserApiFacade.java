package ase.csie.cts.dp.facade;

public interface UserApiFacade {
	
	//the facade method
	public static String getUserProfile (String user,String pass) {
		
		// 1. create a game sever instance and connect
		GameServer server= new GameServer();
		server.connect();
		
		//2 create a login
		Login login = new Login("player1", "1234");
		
		//3.create and get the profile
		UserProfile userProfile= login.getUserProfile();
		String profile= userProfile.getProfile();
		
		return profile;
	} 

}
