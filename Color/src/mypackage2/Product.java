package mypackage2;

public class Product {
	private String name;
	private int price;
	private int tax;
	
	//Constructors
	public Product(String name, int price, int tax){
		this.name = name;
		this.price = price;
		if(tax <= 100 && 0 <= tax){
			this.tax = tax;
		}
		else{
			this.tax = 0;
		}
	}

	//Getters, Setters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getTax() {
		return tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	//Methods
	public int getTaxedPrice(){
		return (this.price * (100 + this.tax)) / 100;
	}
	
	@Override
	public String toString(){
		return this.name + " " + this.price + " Ft " + this.tax + "%";
	}
	
	public void increasePrice(int percentage){
		this.price = (this.price * (100 + percentage)) / 100;
	}
	
	public int comparePrice(Product otherProduct){
		if(this.getTaxedPrice() < otherProduct.getTaxedPrice()){
			return -1;
		}
		else if(this.getTaxedPrice() > otherProduct.getTaxedPrice()){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
}
