package cts.lepirda.damon.g1093.pattern.factory;

public class ConcertTicket extends OnlineBooking{

	public ConcertTicket(String eventName, int price) {
		super(eventName, price);
	}

	@Override
	public String getType() {
		return "Concert";
	}

}
