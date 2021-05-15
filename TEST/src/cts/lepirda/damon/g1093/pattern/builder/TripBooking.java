package cts.lepirda.damon.g1093.pattern.builder;

public class TripBooking {
	private String hotel;
	private	boolean hasBreakfast;
	private int noPeopleInRoom;
	private	boolean hasSeaSideView;
	private	boolean hasSmokingRoom;
	private int floorLevel;
	
	public TripBooking(String hotel, boolean hasBreakfast, int noPeopleInRoom, boolean hasSeaSideView,
			boolean hasSmokingRoom, int floorLevel) {
		super();
		this.hotel = hotel;
		this.hasBreakfast = hasBreakfast;
		this.noPeopleInRoom = noPeopleInRoom;
		this.hasSeaSideView = hasSeaSideView;
		this.hasSmokingRoom = hasSmokingRoom;
		this.floorLevel = floorLevel;
	}

	
	
	private TripBooking() {
		
	}
	
	public static class TripBuilder{
		TripBooking tripBooking;
		
		public TripBuilder(String hotelName) {
			this.tripBooking= new TripBooking();
			this.tripBooking.hotel= hotelName;
		}
		
		public TripBuilder addBreakfast() {
			this.tripBooking.hasBreakfast=true;
			return this;
		}
		
		public TripBuilder addNoPeopleInRoom(int noPeopleInRoom) {
			this.tripBooking.noPeopleInRoom=noPeopleInRoom;
			return this;
		}
		
		public TripBuilder addSeaSideView() {
			this.tripBooking.hasSeaSideView=true;
			return this;
		}
		
		public TripBuilder addSmokingRoom() {
			this.tripBooking.hasSmokingRoom=true;
			return this;
		}
		
		public TripBuilder addFloorLevel(int floorLevel) {
			this.tripBooking.floorLevel=floorLevel;
			return this;
		}
		
		
		
		public TripBooking build() {
			
			return this.tripBooking;
		}
	}
}
