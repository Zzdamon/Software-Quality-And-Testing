package ase.csie.cts.assignment2.testing;

import ase.csie.cts.assignment2.Account;
import ase.csie.cts.assignment2.AccountType;
import ase.csie.cts.assignment2.services.FeeComputation2021;
import ase.csie.cts.assignment2.services.MonthlyPaymentComputation2021;

public class Test {

	public static void main(String[] args) throws Exception {
		Account account=new Account(3, 12, AccountType.SUPER_PREMIUM,new FeeComputation2021(),new MonthlyPaymentComputation2021());
//		Account account=new Account(3, 12, AccountType.SUPER_PREMIUM);
//				account.setMonthlyPaymentService(new MonthlyPaymentComputation2021());
//				var feeComputationService= new FeeComputation2021();
//				account.setFeeComputationService(feeComputationService);
		account.setDaysActive(643);
		var payment= account.getMonthlyPayment();
		System.out.println(payment);
		
		Account account2= new Account(4, 22, AccountType.SUPER_PREMIUM,new FeeComputation2021(),new MonthlyPaymentComputation2021());
		account2.setDaysActive(5000);
		
		Account[] accountArray= new Account[2];
		accountArray[0]=account;
		accountArray[1]=account2;
	
		var totalFee=Account.calculateTotalFee(accountArray);
		
		System.out.println(account.getAccountFee());
		System.out.println(totalFee);
	}

}
