package cts.lepirda.damon.g1093.pattern.factory;

public abstract class AbstractBookingFactory {
	public abstract OnlineBooking getBooking(BookingType bookingType,String eventName,int price);
}
