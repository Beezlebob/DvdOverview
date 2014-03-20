package backEnd.test;


import backEnd.core.*;

import backEnd.system.MainSystem;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainSystem ms = new MainSystem();
		
		
		Dvd dvd1 = new Dvd("Once in a lifetime","","",0,0,null,null,null,null);
		Location l1 = new Location("Hylla");
		Dvd dvd2 = new Dvd("Shit movie", "", "", 0, 0, null, l1, dvd1, null);
		Genre g1 = new Genre("Action");
		
		ms.addToTree(g1);
		ms.addToTree(dvd1);
		ms.addToTree(l1);
		ms.addToTree(dvd2);
		
		Dvd test = new Dvd("shit movie");
		
		System.out.println("Size of dvdTree :"+ms.sizeArray()[0]);
		System.out.println("Size of locationTree:"+ms.sizeArray()[1]);
		System.out.println("Size of genreTree:"+ms.sizeArray()[2]);
		System.out.println(ms.treeContains(test));
		System.out.println(test.getName());
		System.out.println(ms.treeContains(test));
	}

}
