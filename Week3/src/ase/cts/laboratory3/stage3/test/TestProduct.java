package ase.cts.laboratory3.stage3.test;

import java.util.ArrayList;

import ase.cts.laboratory3.exceptions.InvalidAccountAgeException;
import ase.cts.laboratory3.exceptions.InvalidPriceException;
import ase.cts.laboratory3.stage3.Product;
import ase.cts.laboratory3.stage3.ProductType;
import ase.cts.laboratory3.stage3.services.MarketingInterface;
import ase.cts.laboratory3.stage3.services.MkStrategySpring2021;
import ase.cts.laboratory3.stage3.services.ValidatorService;

public class TestProduct {
	
	public static ArrayList<Object> services= new ArrayList<>();
	
	public static void startup() { 
		services.add(new MkStrategySpring2021());
		services.add(new ValidatorService());
	}

	public static void main(String[] args) {
		startup();
		
		Product product= new Product(new MkStrategySpring2021(), new ValidatorService());
		float finalPrice=0;
		try {
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
			System.out.println("The final price is "+finalPrice);
			
			product.setMarketingStrategy(new MarketingInterface() {
				
				@Override
				public float getFidelityDiscount(int accountAgeInYears) {
					
					return 0.5f;
				}
			});
			
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
			System.out.println("The final price is "+finalPrice);
			
			
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final price is "+finalPrice);

	}

}
