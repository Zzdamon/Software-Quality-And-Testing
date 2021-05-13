package practice.dp.factoryMethod;

public class FullPackage extends  PackageInterface{
	private static double pricePerPerson=215.5;

	public FullPackage(int noPeople) {
		super(noPeople);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		return this.noPeople*pricePerPerson;
	}

}
