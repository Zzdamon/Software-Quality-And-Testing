package ase.csie.cts.assignment3.singleton;

public class DatabaseConnection {

	private String connectionString;
	
	private static DatabaseConnection databaseConnection=null;

	private DatabaseConnection(String connectionString) {
		this.connectionString = connectionString;
	}
	
	public static synchronized DatabaseConnection getDatabaseConnection() {
		if(databaseConnection==null) {
			databaseConnection= new DatabaseConnection("ConnectionString");
		}
		return databaseConnection;
	}
	
	private DatabaseConnection() {
		
	}
}
