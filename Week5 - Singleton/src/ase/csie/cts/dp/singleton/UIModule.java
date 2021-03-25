package ase.csie.cts.dp.singleton;

public class UIModule {
	public UIModule() {
		RESTBackend backend = RESTBackend.getRESTBackend();
	}
}
