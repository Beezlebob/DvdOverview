package backEnd.core;

public class Dvd {
	
	//VARIABLES
	private String Title;
	private String ProdCountry;
	private String OptionalInfo;
	
	private int PgRating;
	private int ProdYear;
	private int Rating;
	
	private Genre genre;
		
	private Location location;
	
	private Dvd PreQuel;
	private Dvd SeQuel;
	
	//METHODS
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getProdCountry() {
		return ProdCountry;
	}
	public void setProdCountry(String prodCountry) {
		ProdCountry = prodCountry;
	}
	public String getOptionalInfo() {
		return OptionalInfo;
	}
	public void setOptionalInfo(String optionalInfo) {
		OptionalInfo = optionalInfo;
	}
	public int getPgRating() {
		return PgRating;
	}
	public void setPgRating(int pgRating) {
		PgRating = pgRating;
	}
	public int getProdYear() {
		return ProdYear;
	}
	public void setProdYear(int prodYear) {
		ProdYear = prodYear;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Dvd getPreQuel() {
		return PreQuel;
	}
	public void setPreQuel(Dvd preQuel) {
		PreQuel = preQuel;
	}
	public Dvd getSeQuel() {
		return SeQuel;
	}
	public void setSeQuel(Dvd seQuel) {
		SeQuel = seQuel;
	}
	
	//CONSTRUCTOR
	//Set to blank string or 0 or null if not set in adding movie
	Dvd(String title,String prodC,String optional,int pgRating,int prodYear,Genre genre,Location location,Dvd Prequel,Dvd Sequel){
		setTitle(title);
		setProdCountry(prodC);
		setOptionalInfo(optional);
		setPgRating(pgRating);
		setProdYear(prodYear);
		setGenre(genre);
		setLocation(location);
		setPreQuel(Prequel);
		setSeQuel(Sequel);
	}
}
