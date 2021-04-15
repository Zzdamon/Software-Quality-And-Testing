package ase.csie.cts.dp.decorator;

import ase.csie.cts.dp.adapter.ACMECharacter;
import ase.csie.cts.dp.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("dragon", 1000);
		dragon.move();
		dragon.takeAHit(200);
		dragon.heal(100);
		
//		ACMECharacter dragonWithArmor= new ArmorDecorator(dragon, 200);
//		dragonWithArmor.takeAHit(300);

		dragon= new ArmorDecorator(dragon, 200);
		dragon.takeAHit(300);
		
		dragon= new WoundedDecorator(dragon);
		dragon.takeAHit(300);
		dragon.move();
		dragon.takeAHit(800);
		dragon.move();
		
		ACMECharacter dragon2= new FantasyCharacter("Yellow dragon", 1000);
		dragon2.move();
		dragon2.takeAHit(200);
		dragon2.move();
	}

}
