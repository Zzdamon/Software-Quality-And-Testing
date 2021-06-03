package lepirda.damon.g1093.singleton;

import lepirda.damon.g1093.ServerInterface;

public class Server implements ServerInterface{

	int port;
	int maxConnections;
	String ipAddress;
	
	private static Server server=null;
	
	private Server(int port, int maxConnections, String ipAddress) {
		System.out.println("Opening a connection to the backend service");
		this.port = port;
		this.maxConnections = maxConnections;
		this.ipAddress=ipAddress;
	}
	
	private Server() {
	
	}
	
	@Override
	public String getIpAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxConnections() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disconnect() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public static synchronized Server getServer() {
		if(server==null) {
			int port=8080;
			int maxConnections=5;
			String ipAddress= "5.14.26.10";
			server=new Server();
		}
		return server;
	}
}
