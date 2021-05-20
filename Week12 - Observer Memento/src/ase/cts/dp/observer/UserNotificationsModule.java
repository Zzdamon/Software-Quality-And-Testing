package ase.cts.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("PopUp: Connection is active");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("PopUp: Connection is lost");
		
	}

}
