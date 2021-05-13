package practice.dp.factoryMethod;

public abstract class AbstractPackageFactory {

	public abstract PackageInterface getPackage(PackageType packageType, int noPeople);
}
