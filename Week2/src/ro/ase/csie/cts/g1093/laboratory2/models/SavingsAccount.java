package ro.ase.csie.cts.g1093.laboratory2.models;

import ro.ase.csie.cts.g1093.laboratory2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1093.laboratory2.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.g1093.laboratory2.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {

	public static final double MIN_BALANCE=100;
	
	public SavingsAccount(String iban) {
		super(iban,MIN_BALANCE);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public void deposit(Double amount) {
		this.balance+=amount;
		
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFundsException {
		if(amount>this.balance) {
			throw new InsufficientFundsException("you need more money");
		}
		else
			this.balance-=amount;
	}

	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
		if(this==destination) {
			throw new IllegalTransferException();
		}
		
		this.withdraw(amount);
		destination.deposit(amount);
		
	}
	
	@Override
	public void AddInterest (double interestPercentRate)
	{
		this.balance*=(1+interestPercentRate/100);
	}
	
}
