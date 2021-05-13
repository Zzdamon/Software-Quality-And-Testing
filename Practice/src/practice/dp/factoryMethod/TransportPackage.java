package practice.dp.factoryMethod;

public class TransportPackage extends PackageInterface{
	private static double pricePerPerson=125.5;
	public TransportPackage(int noPeople) {
		super(noPeople);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
	
		return this.noPeople* this.pricePerPerson;
	}
	
}
