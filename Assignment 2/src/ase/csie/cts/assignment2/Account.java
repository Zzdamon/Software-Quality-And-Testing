package ase.csie.cts.assignment2;

import ase.csie.cts.assignment2.services.FeeComputationInterface;
import ase.csie.cts.assignment2.services.MonthlyPaymentInterface;

public final class Account {
	private double	loanValue,monthlyPercentRate;	
	private int	daysActive;
	private AccountType accountType;
	private MonthlyPaymentInterface monthlyPaymentService=null;
	private FeeComputationInterface feeComputationService=null;
	

	public void setFeeComputationService(FeeComputationInterface feeComputationService) {
		if(feeComputationService==null) {
			throw new NullPointerException();
		}
		this.feeComputationService = feeComputationService;
	}

	public void setMonthlyPaymentService(MonthlyPaymentInterface monthlyPaymentService) {
		if(monthlyPaymentService==null) {
			throw new NullPointerException();
		}
		this.monthlyPaymentService=monthlyPaymentService;
	}
	
	
	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getMonthlyPercentRate() {
		System.out.println("The rate is "+monthlyPercentRate);
		return this.monthlyPercentRate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyPayment() {
		return this.monthlyPaymentService.getMonthlyPayment(loanValue, monthlyPercentRate);
	}
	
	
	public void setDaysActive(int daysActive) {
		this.daysActive = daysActive;
	}

	
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
			throw new Exception();
		else
		{
			this.loanValue = loanValue;
		}
	}
		
	public double getAccountFee() {
		return this.feeComputationService.calculateAccountFee(loanValue, accountType, monthlyPercentRate, daysActive);

	}

	public static final double calculateTotalFee(Account[] 	accounts)
	{
		double totalFee=0;
		for (Account account : accounts) {
			totalFee+=account.getAccountFee();
		}
		return totalFee;
	}

	public Account(double loanValue, double monthlyPercentRate, AccountType accountType, FeeComputationInterface feeComputationService, MonthlyPaymentInterface monthlyPaymentService)
			throws Exception {
		if(loanValue<0)
			throw new Exception();
		else
		{
			this.loanValue = loanValue;
		}
		if(feeComputationService==null || monthlyPaymentService==null) {
			throw new NullPointerException();
		}
		this.monthlyPercentRate = monthlyPercentRate;
		this.accountType = accountType;
		this.feeComputationService=feeComputationService;
		this.monthlyPaymentService=monthlyPaymentService;

	}
	
	@Override
	public String toString() {
		return "Loan: "+this.loanValue+"; rate: "+this.monthlyPercentRate+"; days active:"+daysActive+"; Type: "+accountType+";";

	}

}