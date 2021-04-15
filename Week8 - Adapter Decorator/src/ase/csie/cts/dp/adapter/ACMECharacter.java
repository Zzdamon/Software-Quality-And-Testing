package ase.csie.cts.dp.adapter;

public abstract class ACMECharacter {

	protected String name;
	protected int lifepoints;
	public ACMECharacter(String name, int lifepoints) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
	}
	public String getName() {
		return name;
	}
	public int getLifepoints() {
		return lifepoints;
	}
	
	public abstract void move();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
}
