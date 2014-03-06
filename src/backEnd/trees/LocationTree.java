package backEnd.trees;

import java.util.TreeSet;

import backEnd.core.Location;

public class LocationTree {
	TreeSet<Location> locations;
	
	boolean addLocation(Location location){
		try{
			locations.add(location);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	boolean delLocation(Location location){
		if(locations.contains(location)){
			locations.remove(location);
			return true;
		}
		return false;
	}
}
