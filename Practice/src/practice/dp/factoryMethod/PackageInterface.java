package practice.dp.factoryMethod;

public abstract class PackageInterface {
 int noPeople;
 
	public PackageInterface(int noPeople) {
	super();
	this.noPeople = noPeople;
}

	public abstract double getPrice();
 
}
