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
			System.out.print(factor(i));
			System.out.print(' ');
			System.out.println(factorr(i));
		}
		
		//3.feladat
		
		System.out.print('i');
		System.out.print(' ');
		System.out.println('j');
		for(int i = 2; i < 100; i++){
			for(int j = 2; j < 100; j++){
				if((isPrime(i))&&(isPrime(j))){
					System.out.print(i);
					System.out.print(' ');
					System.out.println(j);
				}
			}
		}
		
		//5. feladat
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
		//4. feladat
		
		double[] a = new double[10];
		
		
	}
	//2. feladat
	private static int factor(int x){
		int f = 1;
		for(; x > 0;x--){
			f *= x; 
		}
		return f;
	}
	//2.feladat
	private static int factorr(int x){
		if(x == 1){
			return 1;
		}
		else{
			return x*factorr(x-1);
		}
	}
	//3.feladat
	private static boolean isPrime(int x){
		for(int i = 2; i < x; i++){
			if((x%i) == 0){
				return false;
			}
		}
		return true;
	}
	//4. feladat
	private static boolean linsearch(double[] a, double b){
		for(int i = 0; i < (double)a.length; i++){
			if(a[i] == b){
				return true;
			}
		}
		return false;
	}
	//4. feladat
	private static void order(double[] a){
		double c = 0;
		for(int i = 1; i < a.length; i++){
			for(int j = 1; j < ((a.length-i)+1); j++){
				if(a[j] > a[(a.length-i)+1]){
					c = a[(a.length-i)+1];
					a[(a.length-i)+1] = a[j];
					a[j] = c;
				}
			}
		}
	}
	
	//4. feladat
	private static boolean binsearch(double[] a, double b){
		//TODO
		return false;
	}
}
