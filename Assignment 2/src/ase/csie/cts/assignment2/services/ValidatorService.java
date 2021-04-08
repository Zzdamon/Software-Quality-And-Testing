package ase.csie.cts.assignment2.services;

import ase.csie.cts.assignment2.exceptions.InvalidLoanException;

public class ValidatorService implements ValidatorInterface{

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanException {
		if (loanValue<0) {
			throw new InvalidLoanException();
		}
		
	}

}
