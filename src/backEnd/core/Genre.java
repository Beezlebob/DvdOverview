package backEnd.core;

import java.util.Iterator;

public class Genre extends SuperCore{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}
	
	public Genre(String name){
		setName(name);
	}

	@Override
	public Iterator<CoreInterface> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
