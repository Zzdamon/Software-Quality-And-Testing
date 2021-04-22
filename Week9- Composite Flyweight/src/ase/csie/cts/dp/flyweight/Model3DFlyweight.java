package ase.csie.cts.dp.flyweight;

import java.util.ArrayList;

public class Model3DFlyweight implements Model3DInterface{

	String name;
	public Model3DFlyweight(String name) {
		super();
		this.name = name;
	}
	ArrayList<Integer> points = new ArrayList<>();
	@Override
	public void display(ScreenData screenDetails) {
		System.out.println(String.format("Displaying %s at %d, %d, %d with color %s",
				name, 
				screenDetails.x, screenDetails.y, screenDetails.z,screenDetails.textureColor));
		
	}

}
