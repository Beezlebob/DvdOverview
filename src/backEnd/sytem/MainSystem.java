package backEnd.sytem;

import backEnd.core.*;
import backEnd.trees.GenericTree;

public class MainSystem {
	GenericTree<CoreInterface> dvdTree,locationTree,genreTree;
	
	MainSystem(){
		dvdTree = new GenericTree<CoreInterface>();
		locationTree = new GenericTree<CoreInterface>();
		genreTree = new GenericTree<CoreInterface>();
	}

	boolean addToTree(CoreInterface ci){
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
	boolean treeContains(CoreInterface ci){
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
	CoreInterface getTreeObject(CoreInterface ci){
		if(ci.getClass() == Dvd.class){
			return dvdTree.get(ci);
		}else if(ci.getClass() == Location.class){
			return locationTree.get(ci);
		}else if(ci.getClass() == Genre.class){
			return genreTree.get(ci);
		}
		return null;
	}

}
