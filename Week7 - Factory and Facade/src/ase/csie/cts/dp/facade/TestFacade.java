package ase.csie.cts.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		// 1. create a game sever instance and connect
		GameServer server= new GameServer();
		server.connect();
		
		//2 create a login
		Login login = new Login("player1", "1234");
		
		//3.create and get the profile
		UserProfile userProfile= login.getUserProfile();
		String profile= userProfile.getProfile();
		
		String profile2=UserApiFacade.getUserProfile("player2", "asdf");
	}

}
