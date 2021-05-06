package ase.csie.cts.dp.proxy;

public class LoginModule implements LoginInterface {

	String severIP;
	String dbConnection;

	@Override
	public boolean login(String username, String pass) {
		System.out.println("Connecting to the db: "+ dbConnection);
		if(username.toLowerCase().equals("admin") && pass.equals("1234admin")) {
			return true;
		}
		return false;
	}
	@Override
	public boolean checkServerStatus() {
		
		return true;
	}
	public LoginModule(String severIP, String dbConnection) {
		super();
		this.severIP = severIP;
		this.dbConnection = dbConnection;
	}
	
}
