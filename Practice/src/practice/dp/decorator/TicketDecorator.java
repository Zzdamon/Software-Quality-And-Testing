package practice.dp.decorator;

public abstract class TicketDecorator extends TicketInterface{

	TicketInterface ticket=null;
	
	public TicketDecorator(TicketInterface ticket) {
		super(ticket.name, ticket.departureLocation, ticket.arrivalLocation);
		this.ticket=ticket;
	}

	@Override
	public void printTicket() {
		this.ticket.printTicket();
		
	}

	@Override
	public void isAvailable() {
		this.ticket.isAvailable();
		
	}
	

}
