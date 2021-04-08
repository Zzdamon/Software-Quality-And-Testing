package ase.csie.cts.assignment2.services;

import ase.csie.cts.assignment2.exceptions.InvalidLoanException;

public interface ValidatorInterface {
	public void validateLoanValue(double loanValue)  throws InvalidLoanException;

}
