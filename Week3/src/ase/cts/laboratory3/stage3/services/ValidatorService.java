package ase.cts.laboratory3.stage3.services;

import ase.cts.laboratory3.exceptions.InvalidAccountAgeException;
import ase.cts.laboratory3.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorInterface{

	@Override
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
		if(accountAgeInYears<0) {
		throw new InvalidAccountAgeException();	
		}
	}

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if(price<=0) {
		throw new InvalidPriceException();		
		}
	}

}
