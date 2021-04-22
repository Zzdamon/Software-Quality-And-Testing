package ase.csie.cts.assignment3.builder.services;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class CoordinatesService{

	
	public static HashMap<String,Double> getCoordinatesFromApi(String address) {
		
		//calls and awaits API to get the list of coords
		
		HashMap<String, Double> coords= new  HashMap<String,Double> (2);
		coords.put("lat", 46.623464);
		coords.put("lng", 45.234235);
		
		return coords;
	}

}
