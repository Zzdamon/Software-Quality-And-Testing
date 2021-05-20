package cts.lepirda.damon.g1093.pattern.flyweight;

import java.util.ArrayList;

public class ImageGallery{
	String region;
	ArrayList<GalleryImage> images;

	public ImageGallery(String region,ArrayList<GalleryImage> images) {
		super();
		this.images = images;
		this.region= region;
	}
	
	
	
}
