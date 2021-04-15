package ase.csie.cts.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {

		ACMECharacter dragon= new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(200);
		dragon.heal(100);
		
		DisneyActions donald = new DonaldDuck("donald duck", 500);
		donald.changeLocation(100, 50);
		donald.losePower(56);
		donald.recoverPower(100);
		
		//use adapter
		ArrayList<ACMECharacter> characters= new ArrayList<>();
		characters.add(dragon);
//		characters.add(donald); doesnt work - not an ACMECharacter
		
		Disney2ACMEAdapter donaldAdapter= new Disney2ACMEAdapter(donald);
		characters.add(donaldAdapter); 
		
		for(ACMECharacter hero : characters) {
			hero.move();
			hero.takeAHit(50);
		}
	}

}
