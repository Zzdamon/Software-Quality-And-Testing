package ase.csie.cts.assignment2.services;

import ase.csie.cts.assignment2.Account;
import ase.csie.cts.assignment2.AccountType;

public class FeeComputation2021 implements FeeComputationInterface {

	@Override
	public double calculateAccountFee(double loanValue, AccountType accountType, double monthlyPercentRate, int daysActive) {
		
		if(accountType==AccountType.PREMIUM ||  accountType==AccountType.SUPER_PREMIUM) {
			return this.brokersFee* computeInterestPrincipal(loanValue,monthlyPercentRate,daysActive);
		}
		
		return 0;
	}

	private double computeInterestPrincipal(double loanValue,double monthlyPercentRate, int daysActive) {
		return loanValue*Math.pow(monthlyPercentRate,(daysActive/365)) - loanValue;
	}	
}
