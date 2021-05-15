package cts.lepirda.damon.g1093.pattern.factory;

public class MuseumTicket extends OnlineBooking {

	public MuseumTicket(String eventName, int price) {
		super(eventName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Museum";
	}

}
