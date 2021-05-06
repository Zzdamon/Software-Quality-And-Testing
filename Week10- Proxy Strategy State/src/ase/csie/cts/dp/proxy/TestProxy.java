package ase.csie.cts.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		LoginInterface loginModue= new LoginModule("10.0.0.1","users");
		
		if(loginModue.login("admin", "admin1234")) {
			System.out.println("Hello admin");
		}
		else {
			System.out.println("wrong credentials");
		}
		
		loginModue=new LoginWith2FactorAuth(loginModue);
		
		String[] password= new String[] {"1234","123445","admin","root","1234admin"};
		for(String pass: password) {
			if(loginModue.login("admin", pass)) {
				System.out.println("Found it: "+ pass);
				break;
			}
		}
	}

}
