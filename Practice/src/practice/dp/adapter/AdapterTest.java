package practice.dp.adapter;

import java.util.ArrayList;
import java.util.Iterator;

import practice.dp.factoryMethod.HousingPackage;
import practice.dp.factoryMethod.PackageInterface;

public class AdapterTest {

	public static void main(String[] args) {
		RentalCarPackageAdapter lamboPackage = new RentalCarPackageAdapter(new Lambo());
		PackageInterface housingPackage= new HousingPackage(3);
		ArrayList<PackageInterface> packageList= new ArrayList<PackageInterface>();
		
		packageList.add(lamboPackage);
		packageList.add(housingPackage);
		
		for (PackageInterface pack : packageList) {
			System.out.println(pack.getPrice()); 
		}
	}
	
}
