package firstpackage;

public class WinnerModel extends Model{
	public int yearWon;
	public FilmCategories categoryWon;
	
	//Constructors
	public WinnerModel(int i, int year, int yearWon){
		super(i, year);
		this.yearWon = yearWon;
		this.categoryWon = category;
	}
	
	public WinnerModel(String title, String producer, FilmCategories category, int year, String[] actors, int yearWon){
		super(title, producer, category, year, actors);
		this.yearWon = yearWon;
		this.categoryWon = category;
	}
	
	//Methods
	@Override
	public String toString(){
		return super.toString() + " " + this.yearWon;
	}
	
	
}
