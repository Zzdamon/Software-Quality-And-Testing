package lepirda.damon.g1093.factory;

public class Courier extends User {

	private String licensePlate;

	public Courier(String name, String surname, String licensePlate) {
		super(name, surname);
		this.licensePlate = licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public void joinSignalRGroup() {
		System.out.println(this.surname +" "+ this.name +" joined couriers group");
		
	}
	
	
	
}
