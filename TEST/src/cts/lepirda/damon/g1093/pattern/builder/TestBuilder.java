package cts.lepirda.damon.g1093.pattern.builder;

public class TestBuilder {
	public static void main(String[] args) {
		
		TripBooking trip= new TripBooking.TripBuilder("Vraja Marii").build();
		TripBooking trip2= new TripBooking.TripBuilder("Vraja Marii").addBreakfast().addNoPeopleInRoom(3).build();

		
		//		trip1.hasBreakfast=true;
//		TripBooking trip3=new TripBooking();
		// can't do that. it throws compilation errors which should happen. i commented it so it doesn't have errors
	}
}
