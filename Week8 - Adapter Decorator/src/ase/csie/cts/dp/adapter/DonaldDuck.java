package ase.csie.cts.dp.adapter;

public class DonaldDuck implements DisneyActions{

	String name;
	int powerLvl;
	
	
	
	public DonaldDuck(String name, int powerLvl) {
		super();
		this.name = name;
		this.powerLvl = powerLvl;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPowerLevel() {
		return this.powerLvl;
	}

	@Override
	public void losePower(int power) {
		System.out.println(String.format("Losing %d power", power));
		this.powerLvl-=power;
		
	}

	@Override
	public void recoverPower(int power) {
		System.out.println(String.format("Recovering %d power", power));
		this.powerLvl+=power;
		
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("moving to new coordinates");
		
	}

}
