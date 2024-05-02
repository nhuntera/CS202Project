package clinic;

public class Physician {
	private String name;
	private int[] avalableHours;
	
//Constructor
	public void physician(String name, int[] avalableHours) {
		this.name = name;
		this.avalableHours = avalableHours;
	}
	
//Getters
	public String getName() {
		return name;
	}
	
	public int[] getAvalableHours() {
		return avalableHours;
	}

}
