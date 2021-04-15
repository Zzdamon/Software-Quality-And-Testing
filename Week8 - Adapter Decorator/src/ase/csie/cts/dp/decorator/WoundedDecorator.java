package ase.csie.cts.dp.decorator;

import ase.csie.cts.dp.adapter.ACMECharacter;

public class WoundedDecorator  extends ACMEDecorator{

	public static final int MIN_POINTS=200;
	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		if(this.character.getLifepoints()<MIN_POINTS) {
			System.out.println("you cant move");

		}
		else 
			this.character.move();

	}

}
