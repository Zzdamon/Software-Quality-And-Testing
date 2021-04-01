package ase.csie.cts.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		//create the object
//		SuperHero superHero = new SuperHero();
		//init it
		//TO DO: dont forget
		
		SuperHero superHero2 = new SuperHero("Superman", 200, false, false, 
				new Weapon(), null, new Flying(), null);
	
		SuperHero superman=new SuperHero.SuperHeroBuilder("Superman", 100).build() ;
		SuperHero joker=new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.isWounded()
				.setRightWeapon(new Weapon())
				.build() ;
		
	}
}
