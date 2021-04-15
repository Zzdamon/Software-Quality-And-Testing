package ase.csie.cts.dp.decorator;

import ase.csie.cts.dp.adapter.ACMECharacter;

public abstract class ACMEDecorator extends ACMECharacter{

	public ACMEDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifepoints());
		this.character=hero;
	}

	@Override
	public void move() {
		this.character.move();
		
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
		
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
		
	}
	
	

	@Override
	public int getLifepoints() {
		return this.character.getLifepoints();
	}



	ACMECharacter character=null;
	
}
