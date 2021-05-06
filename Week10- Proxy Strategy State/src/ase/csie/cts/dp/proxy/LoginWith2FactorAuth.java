package ase.csie.cts.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface{

	LoginInterface loginModule=null;
	
	public LoginWith2FactorAuth(LoginInterface loginModule) {
		this.loginModule=loginModule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code== 1245) {
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean login(String username, String pass) {
		if(this.loginModule.login(username, pass)) {
			System.out.println("Please input the generated code that you received over email");
			System.out.println("Check received code");
			if(checkGeneratedCode(12452)) {
				System.out.println("Hello "+username);
				return true;
			}
			else {
				System.out.println("Wrong code");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

	
}
