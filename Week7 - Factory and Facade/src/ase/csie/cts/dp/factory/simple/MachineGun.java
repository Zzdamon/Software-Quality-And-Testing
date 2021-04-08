package ase.csie.cts.dp.factory.simple;

public class MachineGun extends AbstractWeapon{

	public MachineGun(String color) {
		super(color, 500);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("-> -> -> ->");		
	}

}
