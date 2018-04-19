package firstpackage;

public class Model implements Film{
	private String title;
	public String producer;
	public FilmCategories category;
	private final int year;
	public String[] actors;
	
	//Constructors
	public Model(int i, int year){
		this.title = "Title " + i;
		this.producer = "Producer " + i;
		this.category = FilmCategories.values()[i%(FilmCategories.values().length)];
		this.year = year;
		for (int j = 0; j < this.actors.length; j++) {
			this.actors[j] = "Actor" + j + " Film " + i;
		}
	}
	
	public Model(String title, String producer, FilmCategories category, int year, String[] actors) {
		this.title = title;
		this.producer = producer;
		this.category = category;
		this.year = year;
		this.actors = actors;
	}
	
	//Getters, Setters
	public String getTitle(){
		return this.title;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public FilmCategories getCategory(){
		return this.category;
	}
	
	//Methods
	public String[] getActorsInFilm(Model film){
		return film.actors;
	}
	
	@Override
	public String toString(){
		return this.title + " " + this.producer + " " + this.category + " " + this.year + " " + actors.toString();
	}
	
}
