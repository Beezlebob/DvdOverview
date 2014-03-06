package backEnd.trees;

import java.util.TreeSet;

import backEnd.core.Dvd;


public class DvdTree {
	TreeSet<Dvd> DvdTree;
	
	boolean addDvd(Dvd dvd){
		try{
			DvdTree.add(dvd);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	boolean delDvd(Dvd dvd){
		if(DvdTree.contains(dvd)){
			DvdTree.remove(dvd);
			return true;
		}
		return false;
		
	}
	Dvd getDvd(Dvd dvd){
		if(DvdTree.contains(dvd)){
			return (Dvd) DvdTree.ceiling(dvd);
		}
		return null;
	}
}
