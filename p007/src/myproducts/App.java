package myproducts;

public class App {

	public static void main(String[] args) {
		Bread bread = new Bread("Bread", 200, 21, 1);
		Product product = new Product("Product", 1000, 53);
		
		System.out.println(bread.toString());
		System.out.println(product.toString());
		
		if(product.comparePrice(bread) == 1){
			System.out.println("Product is higher price");
		}
		else if(product.comparePrice(bread) == -1){
			System.out.println("Bread is higher price");
		}
		else{
			System.out.println("Prices are equal");
		}
		
		Product product2 = new Bread("Product 2", 400, 10, 2);
		
		System.out.println(product2.toString());
		
		Bread bread2 = new Bread("Bread 2", 100, 30, 4);
		
		if(Bread.isHigherPricePerQuantity((Bread) product2, bread2)){
			System.out.println(product2.toString());
		}
		else{
			System.out.println(bread2.toString());
		}

	}

}
