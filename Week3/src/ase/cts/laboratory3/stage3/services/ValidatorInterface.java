package ase.cts.laboratory3.stage3.services;

import ase.cts.laboratory3.exceptions.InvalidAccountAgeException;
import ase.cts.laboratory3.exceptions.InvalidPriceException;

public interface ValidatorInterface {
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	public void validatePrice(float price) throws InvalidPriceException;
}
