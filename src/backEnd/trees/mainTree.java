package backEnd.trees;

public class mainTree {

	LocationTree lt;
	GenreTree gt;
	DvdTree dt;
	
	mainTree(){
		lt = new LocationTree();
		gt = new GenreTree();
		dt = new DvdTree();
	}

}
