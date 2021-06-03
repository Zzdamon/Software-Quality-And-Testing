package lepirda.damon.g1093.builder;

import java.util.ArrayList;
import java.util.HashMap;

import lepirda.damon.g1093.ServerInterface;

public class Server implements ServerInterface {

	int port;
	int maxConnections;
	int connected=0;
	String ipAddress;
	public HashMap<String,ServiceInterface> services = new HashMap<>();
	
	
	public Server(int port, int maxConnections, int connected, String ipAddress,  HashMap<String,ServiceInterface> services) {
		super();
		this.port = port;
		this.maxConnections = maxConnections;
		this.connected = connected;
		this.ipAddress = ipAddress;
		this.services = services;
	}
	

	private Server() {
		
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
	
	public int getServiceSize() {
		return this.services.size();
	}

	public static class ServerBuilder{
		Server server;
		
		public ServerBuilder(String ipAddress, int port, int maxConnections) {
			server=new Server();
			this.server.ipAddress=ipAddress;
			this.server.port=port;
			this.server.maxConnections=maxConnections;
			
		}
		public ServerBuilder addSignalR() {
			this.server.services.putIfAbsent("SignalR", new SignalR());
			return this;
		}
		
		public ServerBuilder addCors() {
			this.server.services.putIfAbsent("Cors", new Cors());
			return this;
		}
		
		public ServerBuilder addDbContext() {
			this.server.services.putIfAbsent("DbContext", new DbContext());
			return this;
		}
		
		public Server build() {
			return this.server;
		}
	}
	
}
