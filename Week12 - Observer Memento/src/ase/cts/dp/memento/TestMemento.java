package ase.cts.dp.memento;

public class TestMemento {
public static void main(String[] args) {
	
	SuperHero superman= new SuperHero("Superman",100, "Fly");
	HeroMemento initialSave= superman.createRestorePoint();
	
	superman.takesAHit(50);
	superman.takesAHit(20);
	
	System.out.println(superman.lifepoints);
	
	superman.restore(initialSave);
	System.out.println(superman.lifepoints);
	
}
}
