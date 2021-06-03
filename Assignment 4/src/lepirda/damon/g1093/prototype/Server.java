package lepirda.damon.g1093.prototype;

import lepirda.damon.g1093.ServerInterface;

public class Server implements ServerInterface, Cloneable {

	int port;
	int maxConnections;
	int connected=0;
	String ipAddress;
	
	
	public Server(int port, int maxConnections, String ipAddress) {
		System.out.println("Opening a connection to the backend service");
		this.port = port;
		this.maxConnections = maxConnections;
		this.ipAddress=ipAddress;
	}
	
	private Server() {
		
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Server serverCopy = new Server();
		serverCopy.port=this.port;
		serverCopy.maxConnections=this.maxConnections;
		serverCopy.ipAddress=this.ipAddress;
		return serverCopy;
	}

	@Override
	public String getIpAddress() {
		
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		// TODO Auto-generated method stub
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		// TODO Auto-generated method stub
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		if(connected<maxConnections) {
			connected++;
			return true;
		}
		return false;
	}

	@Override
	public boolean disconnect() {
		if(connected>0) {
			connected--;
			return true;
		}
		return false;
	}

}
