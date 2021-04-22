package ase.csie.cts.dp.flyweight;

import java.util.HashMap;

public class ModelsFactory {
	static HashMap<String, Model3DFlyweight> models=new HashMap<String, Model3DFlyweight>();

	static {
		models.put(ModelType.BUILDING.toString(),new Model3DFlyweight("Building"));
		models.put(ModelType.SOLDIER.toString(),new Model3DFlyweight("Soldier"));
		
	}
	
	public static Model3DInterface getModel(ModelType type) {
		return models.get(type.toString());
	}
}
