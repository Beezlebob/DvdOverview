package backEnd.system;

import backEnd.core.*;
import backEnd.trees.GenericTree;

public class MainSystem {
	public GenericTree<CoreInterface> dvdTree;
	GenericTree<CoreInterface> locationTree, genreTree;
	
	public MainSystem(){
		dvdTree = new GenericTree<CoreInterface>();
		locationTree = new GenericTree<CoreInterface>();
		genreTree = new GenericTree<CoreInterface>();
	}

	public boolean addToTree(CoreInterface ci){
		if(ci.getClass() == Dvd.class){
			dvdTree.add(ci);
			return true;
		}else if(ci.getClass() == Location.class){
			locationTree.add(ci);
			return true;
		}else if(ci.getClass() == Genre.class){
			genreTree.add(ci);
			return true;
		}
		return false;		
	}
	public boolean treeContains(CoreInterface ci){
		if(ci.getClass() == Dvd.class){
			if(dvdTree.contains(ci)){
				return true;
			}
			return false;
		}else if(ci.getClass() == Location.class){
			if(locationTree.contains(ci)){
				return true;
			}
			return false;
		}else if(ci.getClass() == Genre.class){
			if(genreTree.contains(ci)){
				return true;
			}
			return false;
		}
		return false;
	}
	public CoreInterface getTreeObject(CoreInterface ci){
		if(ci.getClass() == Dvd.class){
			return dvdTree.get(ci);
		}else if(ci.getClass() == Location.class){
			return locationTree.get(ci);
		}else if(ci.getClass() == Genre.class){
			return genreTree.get(ci);
		}
		return null;
	}
	public int[] sizeArray(){
		int[] a = new int[3];
		a[0] = dvdTree.size();
		a[1] = locationTree.size();
		a[2] = genreTree.size();
		return a;
	}
	
}
