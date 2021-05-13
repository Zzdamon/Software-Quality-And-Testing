package practice.dp.decorator;

public class PlaneTicket extends TicketInterface {

	public PlaneTicket(String name, String departureLocation, String arrivalLocation) {
		super(name, departureLocation, arrivalLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printTicket() {
		System.out.println("Plane Ticket");
		System.out.println("Name: "+this.name);
		System.out.println("Departure: "+this.departureLocation);
		System.out.println("Arrival: "+this.arrivalLocation);
		
	}

	@Override
	public void isAvailable() {
		System.out.println("Checking if there are available sits...");
		System.out.println("There are 65 available sits left");
		
	}

}
