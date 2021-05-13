package practice.dp.adapter;

import practice.dp.factoryMethod.PackageInterface;

public class RentalCarPackageAdapter extends PackageInterface{

	private RentalCarInterface rentalCar=null;
	public RentalCarPackageAdapter(RentalCarInterface rentalCar) {
		super(0);
		this.rentalCar=rentalCar;
	}

	@Override
	public double getPrice() {
		return this.rentalCar.rentalPrice();
	}

}
