package ase.csie.cts.dp.singleton;

public class PlayerModule {
	public PlayerModule() {
//		RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
