package practice.dp.bulider.ex1;

public class TransportPackage {

	boolean hasWifi, hasPets, hasSmokingPlaces, hasAC, hasTV;

	public TransportPackage(boolean hasWifi, boolean hasPets, boolean hasSmokingPlaces, boolean hasAC, boolean hasTV) {
		super();
		this.hasWifi = hasWifi;
		this.hasPets = hasPets;
		this.hasSmokingPlaces = hasSmokingPlaces;
		this.hasAC = hasAC;
		this.hasTV = hasTV;
	}

	private TransportPackage() {
		
	}
	
	public static class TransportPackageBuilder{
		private TransportPackage transportPackage;
		
		public TransportPackageBuilder() {
			this.transportPackage= new TransportPackage();
		}
		
		public TransportPackage build() {
			return this.transportPackage;
		}
		
		public TransportPackageBuilder setHasWifi() {
			this.transportPackage.hasWifi = true;
			return this;
		}

		public TransportPackageBuilder setHasPets() {
			this.transportPackage.hasPets = true;
			return this;

		}

		public TransportPackageBuilder setHasSmokingPlaces() {
			this.transportPackage.hasSmokingPlaces = true;
			return this;

		}

		public TransportPackageBuilder setHasAC() {
			this.transportPackage.hasAC = true;
			return this;

		}

		public TransportPackageBuilder setHasTV() {
			this.transportPackage.hasTV = true;
			return this;

		}
	}
}
