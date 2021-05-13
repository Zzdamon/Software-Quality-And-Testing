package practice.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Patient patient= new Patient("George George", 5300);
		Card card= new Card();
		Cash cash = new Cash();
		
		patient.pay();
		patient.setModDePlata(cash);
		patient.pay();
	
		patient.setModDePlata(card);
		patient.pay();
	}

}
