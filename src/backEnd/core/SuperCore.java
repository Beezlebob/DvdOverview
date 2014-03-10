package backEnd.core;

abstract class SuperCore implements CoreInterface{
	
	String Name;
	
	public String getName(){
		return Name;
	}
	
	public int compareTo(CoreInterface ci){
		return getName().compareTo(ci.getName());
	}
	
}
