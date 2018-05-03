package tartalyos;

public class Tartaly extends Tarolo{ // 1
	double nyomas; // 1
	
	public Tartaly(int terfogat, double nyomas){ // 1
		super(terfogat);
		this.nyomas = nyomas;
	}
	
	@Override
	public boolean veszelyesE(){ // 1
		if(terfogat*nyomas > 100){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){ // 1
		if(this.veszelyesE()){
			return this.terfogat + " " + this.nyomas + " " + "veszélyes";
		}
		return this.terfogat + " " + this.nyomas + " " + "nem veszélyes";
	}
	
	public boolean nagyobbNyomasuE(Tartaly tartaly){ // 1
		if(this.nyomas > tartaly.nyomas){
			return true;
		}
		return false;
	}
	
	public static Tartaly nagyobbNyomasu(Tartaly tartaly1, Tartaly tartaly2){ // 1
		if(tartaly1.nyomas > tartaly2.nyomas){
			return tartaly1;
		}
		else if(tartaly1.nyomas < tartaly2.nyomas){
			return tartaly2;
		}
		else{
			return tartaly1;
		}
	}
	
	
}
