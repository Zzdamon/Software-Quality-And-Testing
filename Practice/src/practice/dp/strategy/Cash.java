package practice.dp.strategy;

public class Cash implements ModDePlataInterface{

	@Override
	public void pay(double amount) {
		System.out.println("Payed "+amount+ "using cash");
		
	}

}
