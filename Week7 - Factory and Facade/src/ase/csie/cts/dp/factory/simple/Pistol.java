package ase.csie.cts.dp.factory.simple;

public class Pistol extends AbstractWeapon{

	public Pistol(String color, int power,int distance) {
		super(color, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("--------------->");
		
	}

}
