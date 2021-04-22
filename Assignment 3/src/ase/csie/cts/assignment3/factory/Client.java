package ase.csie.cts.assignment3.factory;

public class Client extends User {

	public Client(String name, String surname) {
		super(name, surname);
	}

	private boolean isGoldClient=false;

	public void setGoldClient() {
		this.isGoldClient = true;
	}

	@Override
	public void joinSignalRGroup() {
		System.out.println(this.surname +" "+ this.name +" joined clients group");
		
	}
	
}
