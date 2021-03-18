package ase.cts.laboratory3.stage3;

import ase.cts.laboratory3.exceptions.InvalidAccountAgeException;
import ase.cts.laboratory3.exceptions.InvalidPriceException;
import ase.cts.laboratory3.stage3.services.MarketingInterface;
import ase.cts.laboratory3.stage3.services.MkStrategySpring2021;
import ase.cts.laboratory3.stage3.services.ValidatorInterface;
import ase.cts.laboratory3.stage3.services.ValidatorService;
import ase.cts.laboratory3.stage3.test.TestProduct;

public class Product {
	
//	not like this
//	MarketingInterface mkService=new MkStrategySpring2021();
//	ValidatorInterface validatorService=new ValidatorService();
	
	MarketingInterface mkService=null;
	ValidatorInterface validatorService=null;
	
	public Product() {
		for(Object service: TestProduct.services) {
			if(service instanceof MarketingInterface) {
				this.mkService= (MarketingInterface)service;
			}
			if(this.mkService==null) {
				throw new UnsupportedOperationException();
			}
		}
	}

	public Product(MarketingInterface mkService, ValidatorInterface validatorService) {
		setMarketingStrategy(mkService);
		setValidatorService(validatorService);
	}
	
	public void setMarketingStrategy(MarketingInterface mkService) {
		if(mkService==null ) {
			throw new NullPointerException();
		}
		this.mkService=mkService;
	}
	
	public void setValidatorService(ValidatorInterface validatorService) {
		if(validatorService==null ) {
			throw new NullPointerException();
		}
		this.validatorService=validatorService;
	}
	
	public static float getPriceWithDiscount(float initialPrice,float discountValue) {
		return initialPrice-(discountValue * initialPrice);
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, 
			int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException
	  {
		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);
	
	    float fidelityDiscount = (productType == ProductType.NEW)
	    		? 0 
	    		:mkService.getFidelityDiscount(accountAgeInYears);
	
	    float discountValue=productType.getDiscount();
    	float priceWithDiscount=getPriceWithDiscount(initialPrice, discountValue);
	    float finalPrice = priceWithDiscount*(1-fidelityDiscount);		   	    
	    
	    return finalPrice;
	  }
}