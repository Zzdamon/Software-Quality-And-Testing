package ase.csie.cts.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
		
		RESTBackend backend = RESTBackend.getRESTBackend();

		UIModule uiModule= new UIModule();
		PlayerModule playerModule = new PlayerModule();
		
//		RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		
//		RESTBackend backend2 = RESTBackend.getRESTBackend("www.acs.ase.ro/game","test");
//		RESTBackend backend3 = RESTBackend.getRESTBackend("www.acs.ase.ro/payments","VISA Check");
		
	}

}
