package practice.dp.decorator;

public abstract class TicketInterface {
	String name;
	String departureLocation;
	String arrivalLocation;
	
	
	public TicketInterface(String name, String departureLocation, String arrivalLocation) {
		super();
		this.name = name;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
	}


	public abstract void printTicket();
	public abstract void isAvailable();
}
