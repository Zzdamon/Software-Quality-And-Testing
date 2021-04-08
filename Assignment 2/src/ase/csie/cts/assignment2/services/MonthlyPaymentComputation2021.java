package ase.csie.cts.assignment2.services;

public class MonthlyPaymentComputation2021 implements MonthlyPaymentInterface {

	@Override
	public double getMonthlyPayment(double loanValue, double rate) {
		return loanValue*rate;
	}

}
