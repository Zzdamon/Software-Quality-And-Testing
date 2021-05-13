package practice.dp.strategy;

public class Card implements ModDePlataInterface{

	@Override
	public void pay(double amount) {
		System.out.println("Payed "+amount+ "using Card");
		
	}
	

}
