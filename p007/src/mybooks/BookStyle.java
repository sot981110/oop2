package mybooks;

public class BookStyle extends Book{
	String style;
	
	//Constructors
	public BookStyle(String writer, String title, int publication, int price, String style){
		super(writer, title, publication, price);
		this.style = style;
	}

	//Getters, Setters
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	//Methods
	@Override
	public String toString(){
		return super.toString() + " " + this.style;
	}
	
	
	
}
