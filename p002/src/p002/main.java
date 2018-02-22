package p002;

public class main {

	public static void main(String[] args) {
		
		//1.1 feladat
		Double pi= 1.0;
		for(double i = 1; i < 10000; i++){
			pi*=((2*i)/((2*i)-1)*((2*i)/((2*i)+1)));
		}
		System.out.println(pi*2);
		
		//1.2 feladat
		
		pi = 0.0;
		for(double i = 0; i < 10000; i++){
			pi+=2/(((4*i)+1)*((4*i)+3));
		}
		System.out.println(pi*4);
		
		//2. feladat
		
		for(int i = 1; i <= 10; i++){
			System.out.print(factorr(i));
			System.out.print(' ');
			System.out.println(factorr(i));
		}
		
	}
	
	private static int factor(int x){
		int f = 1;
		for(; x > 0;x--){
			f *= x; 
		}
		return f;
	}
	
	private static int factorr(int x){
		if(x == 1){
			return 1;
		}
		else{
			return x*factorr(x-1);
		}
	}
	
}
