package backEnd.trees;

import java.util.TreeSet;

import backEnd.core.Genre;

public class GenreTree {
	TreeSet<Genre> genres;
	
	boolean addGenre(Genre genre){
		try{
			genres.add(genre);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	boolean delGenre(Genre genre){
		if(genres.contains(genre)){
			genres.remove(genre);
			return true;
		}
		return false;
	}
}
