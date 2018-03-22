package p006;

public class Music {
	
	String performer;
	String title;
	int length;
	
	//Constructors
	public Music(String performer, String title, int length){
		this.performer = performer;
		this.title = title;
		this.length = length;
	}
	
	//Getters
	public String getPerformer() {
		return performer;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	//Setters
	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//Methods
	public String toString(){
		return this.performer + ":" + this.title + "" + this.length + " perc";
	}
	
	public int isLongerThan(Music music){
		if(this.length > music.length){
			return 1;
		}
		else if(this.length < music.length){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public boolean isSamePerformer(String performer){
		if(this.performer.equalsIgnoreCase(performer)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
}
