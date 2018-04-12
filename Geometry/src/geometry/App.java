package geometry;

public class App {

	public static void main(String[] args) {
		Barrel barrel = new Barrel(5, 3.6);
		System.out.println(barrel.toString() + " " + barrel.getVolume());
		
		Cuboid cuboid = new Cuboid(6, 10.5, 6.7);
		System.out.println(cuboid.toString() + " " + cuboid.getVolume());
		
		if(barrel.isBiggerVolume(cuboid)){
			System.out.println("Barrel is bigger");
		}
		else if(cuboid.isBiggerVolume(barrel)){
			System.out.println("Cuboid is bigger");
		}
		else{
			System.out.println("Equal size");
		}

	}

}
