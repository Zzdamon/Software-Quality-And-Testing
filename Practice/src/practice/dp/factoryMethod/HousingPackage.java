package practice.dp.factoryMethod;

public class HousingPackage extends PackageInterface{
	private static double pricePerPerson=175.8;

	public HousingPackage(int noPeople) {
		super(noPeople);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		
		return this.noPeople * pricePerPerson;
	}

}
