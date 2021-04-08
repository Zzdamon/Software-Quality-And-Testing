package ase.csie.cts.assignment2.services;

import ase.csie.cts.assignment2.AccountType;

public interface FeeComputationInterface {
	public static final double brokersFee=0.0125;

	public double calculateAccountFee(double loanValue, AccountType accountType, double monthlyPercentRate, int daysActive);

}
