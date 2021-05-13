package practice.dp.factoryMethod;

public class ConcretePackageFactory extends AbstractPackageFactory{

	@Override
	public PackageInterface getPackage(PackageType packageType, int noPeople) {
		PackageInterface packageInterface=null;
	switch (packageType) {
	case TRANSPORT:
		packageInterface= new TransportPackage(noPeople);
		break;
	case HOUSING:
		packageInterface= new HousingPackage(noPeople);
		break;
	case FULL:
		packageInterface= new FullPackage(noPeople);
		break;

	default:
		throw new UnsupportedOperationException();

	}
		return packageInterface;
	}
	
}
