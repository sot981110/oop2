package myproducts;

public class Bread extends Product{
	private double quantity;
	
	//Constructors
	public Bread(String name, int price, int tax, double quantity){
		super(name, price, tax);
		this.quantity = quantity;
	}

	//Getters, Setters
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	//Methods
	@Override
	public String toString(){
		return super.toString() + " " + this.quantity;
	}
	
	public double getPricePerQuantity(){
		return this.getPrice() / this.quantity;
	}
	public static boolean isHigherPricePerQuantity(Bread bread1, Bread bread2){
		if(bread1.getPricePerQuantity() > bread2.getPricePerQuantity()){
			return true;
		}
		else{
			return false;
		}
	}
	
}
