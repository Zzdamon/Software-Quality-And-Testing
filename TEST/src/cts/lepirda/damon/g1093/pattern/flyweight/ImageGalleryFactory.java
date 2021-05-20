package cts.lepirda.damon.g1093.pattern.flyweight;

import java.util.ArrayList;
import java.util.HashMap;


public class ImageGalleryFactory {
private static HashMap<String, ImageGallery> regionGaleries= new HashMap<>();
	
	public static ImageGallery getRegionGallery(String region) {
		
		if(regionGaleries.get(region) ==null) {
			regionGaleries.put(region, new ImageGallery(region,new ArrayList<>()));
		}
		return regionGaleries.get(region);
	
}
}
