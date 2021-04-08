package ase.csie.cts.dp.factory.simple;

public class Bazooka extends AbstractWeapon{

	public Bazooka(String color, int power, int distance) {
		super(color, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("-------> (*******)");
		
	}

}
