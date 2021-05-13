package practice.dp.decorator;

public class TicketBaggageDecorator extends TicketDecorator {

	int baggageWeight;
	public TicketBaggageDecorator(TicketInterface ticket, int baggageWeight) {
		super(ticket);
		this.baggageWeight=baggageWeight;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printTicket() {
		super.printTicket();
		System.out.println("Baggage Weight: "+ this.baggageWeight);
	}

//	@Override
//	public void isAvailable() {
//		super.isA
//		
//	}

}
