package ase.csie.cts.dp.singleton;

public class RESTBackend {
	String url;
	String data;

	//eager instantiation
//	private static RESTBackend backend = new RESTBackend();

	private static RESTBackend theBackend=null;
	
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() {
		
	}

	public void sendGET() {
		System.out.println("Send GET command to "+this.url);
	}
	
	
	//lazy instantiation example 
	// - connection is created only when someone needs it
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend==null) {
			//get backend data from a configs/settings file
			String url="www.acs.ase.ro/game";
			String data="get backend connection";
			theBackend=new RESTBackend(url,data);
		}
		return theBackend;
	}

}
