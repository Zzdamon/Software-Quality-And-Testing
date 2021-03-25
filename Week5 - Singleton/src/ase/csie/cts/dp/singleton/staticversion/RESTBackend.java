package ase.csie.cts.dp.singleton.staticversion;

public class RESTBackend {
	String url;
	String data;

	public static final RESTBackend theBackend;
	
	//executed only once
	static {
		System.out.println(
				"is executed when the class is loaded by JVM");
		theBackend=new RESTBackend();
		theBackend.url="www.acs.ase.ro/cts";
		
	}
	
	//another block
	{
		System.out.println("is executed before any constructor call");
	}

	private RESTBackend() {
		
	}
	
//	private RESTBackend() {
//		//get data from config files or smth else
//		
//	}

}
