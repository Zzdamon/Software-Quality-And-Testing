package practice.dp.decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		PlaneTicket planeTicket = new PlaneTicket("Lepirda Damon", "Aeroport Bucuresti Baneasa", "Aeroport Constanta");
		planeTicket.isAvailable();
		planeTicket.printTicket();
		
		 TicketInterface ticket2 = new TicketBaggageDecorator(planeTicket, 34);
		 ticket2.isAvailable();
		 ticket2.printTicket();
	}
}
