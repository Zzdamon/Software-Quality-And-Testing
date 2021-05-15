package cts.lepirda.damon.g1093.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {
		AbstractBookingFactory factory = new BookingFactory();
		OnlineBooking booking1= factory.getBooking(BookingType.CONCERT, "Arctic Monkeys",100);
		OnlineBooking booking2= factory.getBooking(BookingType.MUSEUM, "Car museum",40);
		booking1.displayDescription();
		booking2.displayDescription();
	}

}
