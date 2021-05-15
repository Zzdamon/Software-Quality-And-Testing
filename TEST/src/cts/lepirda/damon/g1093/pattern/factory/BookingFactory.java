package cts.lepirda.damon.g1093.pattern.factory;

public class BookingFactory extends AbstractBookingFactory {

	@Override
	public OnlineBooking getBooking(BookingType bookingType, String eventName, int price) {
		OnlineBooking booking;
		switch (bookingType) {
		case CONCERT:
			booking=new ConcertTicket(eventName, price);
			break;
		case MUSEUM:
			booking= new MuseumTicket(eventName, price);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return booking;
	}
	
}
