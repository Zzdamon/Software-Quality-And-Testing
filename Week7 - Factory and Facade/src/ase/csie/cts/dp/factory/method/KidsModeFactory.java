package ase.csie.cts.dp.factory.method;

import ase.csie.cts.dp.factory.simple.AbstractWeapon;
import ase.csie.cts.dp.factory.simple.Bazooka;
import ase.csie.cts.dp.factory.simple.MachineGun;
import ase.csie.cts.dp.factory.simple.Pistol;
import ase.csie.cts.dp.factory.simple.WeaponType;

public class KidsModeFactory extends AbstractWeaponFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
AbstractWeapon weapon=null;
		
		switch (type) {
		case PISTOL:
			weapon= new WaterPistol(color, 200);
			break;
		case MACHINE_GUN:
			weapon= new WaterBaloon(color,500);
			break;
		case BAZOOKA:
			weapon= new WaterBucket(color, 1000);
			break;

		default:
			throw new UnsupportedOperationException();
		}
		return weapon;		
	}

}
