package backEnd.coreFiles;

public class Genre {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Genre(String name){
		setName(name);
	}
}
