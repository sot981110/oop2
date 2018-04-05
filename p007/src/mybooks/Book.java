package mybooks;

public class Book {
	private String writer;
	private String title;
	private Integer publication;
	private Integer price;
	
	public Book(String writer, String title, Integer publication, Integer price){
		this.writer = writer;
		this.title = title;
		if(0 <= publication || publication <= 4000){
			this. publication = publication;
		}
		else{
			this.publication = null;
		}
		if(0 <= price){
			this.price = price;
		}
		else{
			this.price = -1;
		}
	}
	
	//Methods
	public void raisePrice(Integer p){
		if(0 <= p && p <= 500){
			this.price += ((this.price*p)/100); 
		}
	}
	
	public String toString(){
		return this.writer + " " + this.title + " " + this.publication + " " + this.price;
	}
	
	//Getters
	public String getWriter(){
		return this.writer;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public Integer getPublication(){
		if(this.publication != null){
			return this.publication;
		}
		else{
			return null;
		}
	}
	
	public Integer getPrice(){
		if(0 <= price){
			return this.price;
		}
		else{
			return null;
		}
	}
	
	//Setters
	public void setWriter(String writer){
		this.writer = writer;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setPublication(Integer publication){
		if(0 <= publication && publication <= 4000){
			this.publication = publication;
		}
	}
	
	public void setPrice(Integer price){
		if(0 <= price){
			this.price = price;
		}
	}
}
