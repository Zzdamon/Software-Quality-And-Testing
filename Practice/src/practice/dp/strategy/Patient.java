package practice.dp.strategy;

public class Patient {
	String name;
	double amountToPay;
	ModDePlataInterface modDePlata=null;

	public Patient(String name, double amountToPay) {
		this.name = name;
		this.amountToPay = amountToPay;
	}
	
	public void setModDePlata(ModDePlataInterface modDePlata) {
		this.modDePlata = modDePlata;
	}
	
	public void pay() {
		if(this.modDePlata!=null) {
			this.modDePlata.pay(amountToPay);
		}
	}
}
