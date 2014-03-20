package backEnd.core;

import java.util.Iterator;

public class Location extends SuperCore {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toLowerCase();
	}
	
	public Location(String name){
		setName(name);
	}

	@Override
	public Iterator<CoreInterface> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
