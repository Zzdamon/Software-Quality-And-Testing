package ase.cts.laboratory3;

import ase.cts.laboratory3.exceptions.InvalidAccountAgeException;
import ase.cts.laboratory3.exceptions.InvalidPriceException;

public class TestProduct {

	public static void main(String[] args) {

		Product product= new Product();
		
		try {
			product.getFinalPrice(ProductType.DISCOUNT, 0, 0);
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
